$(function() {
	$("#login").click(function() {
		// 清楚原有的提示信息
		$("#count_span").html("");
		$("#password_span").html("");
		// 获取请求参数
		var name = $("#count").val().trim();
		var password = $("#password").val().trim();
		// 检查参数格式
		var isCheck = true;
		if (name == "") {
			$("#count_span").html("用户名为空");
			isCheck = false;
		}
		if (password == "") {
			$("#password_span").html("密码为空");
			isCheck = false;
		}
		// 发送Ajax请求
		if (isCheck) {
			$.ajax({
				url : url_path + "/user/login.do",
				type : "post",
				data : {
					"name" : name,
					"password" : password
				},
				datatype : "json",
				success : function(result) {
					// 正常回调
					if (result.status == 0) {
						// 获取用户ID，写入Cookie
						var userId = result.data;
						addCookie("userId", userId, 2);
						window.location.href = "edit.html"; // 跳转页面
					} else if (result.status == 1) {
						$("#count_span").html(result.msg);
					} else if (result.status == 2) {
						$("#password_span").html(result.msg);
					}
				},
				error : function() {
					alert("登录失败");
				}
			});
		}

	});
})
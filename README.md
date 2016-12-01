# cloudnote
> 功能：

- 笔记本模块，

- 笔记模块，

- 回收站管理，

- 分享和收藏管理，

- 活动管理，

- 用户管理

>  采用的技术：

	HTML+Ajax
	Spring(IOC/AOP/MVC)多功能框架[SpringMVC[Struts2]+Spring(IOC/AOP)+
		MyBatis[Hibernate](访问MySQL数据库)]


>  亮点：

    所有的界面采用HTML静态页面
    所有的请求采用Ajax方式交互
    所有请求返回的JSON结果，统一返回下面结果
    {
      "status":状态
      "msg":消息
      "data":数据
    }
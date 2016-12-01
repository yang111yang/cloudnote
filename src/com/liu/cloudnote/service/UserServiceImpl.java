package com.liu.cloudnote.service;

import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liu.cloudnote.dao.UserDao;
import com.liu.cloudnote.entity.User;
import com.liu.cloudnote.util.NoteResult;
import com.liu.cloudnote.util.NoteUtils;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;

	@Override
	public NoteResult checkLogin(String name, String password) throws Exception {
		NoteResult result = new NoteResult();
		User user = userDao.findByName(name);
		if (user == null) {
			result.setStatus(1);
			result.setMsg("用户名为空");
			return result;
		}
		String md5_pwd = NoteUtils.md5(password);
		if (user.getCn_user_password().equals(md5_pwd)) {
			result.setStatus(2);
			result.setMsg("密码错误");
			return result;
		}
		result.setStatus(0);
		result.setMsg("登录成功");
		result.setData(user.getCn_user_id());
		return result;
	}

}

package com.liu.cloudnote.controller.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liu.cloudnote.service.UserService;
import com.liu.cloudnote.util.NoteResult;

@Controller
@RequestMapping("/user")
public class UserLoginController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/login.do")
	@ResponseBody
	public NoteResult execute(String name, String password) throws Exception{
		NoteResult result = userService.checkLogin(name, password);
		return result;
	}
	
	
}

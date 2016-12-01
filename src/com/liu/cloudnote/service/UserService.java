package com.liu.cloudnote.service;

import com.liu.cloudnote.util.NoteResult;

public interface UserService {
	
	public NoteResult checkLogin(String name, String password) throws Exception;
	
}

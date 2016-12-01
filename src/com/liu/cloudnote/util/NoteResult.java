package com.liu.cloudnote.util;

import java.io.Serializable;

/**
 * 该类主要用于封装请求的返回结果
 * @author liu
 * 2016年12月1日
 */
public class NoteResult implements Serializable {
	
	private int status;
	private String msg; 
	private Object data;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
}

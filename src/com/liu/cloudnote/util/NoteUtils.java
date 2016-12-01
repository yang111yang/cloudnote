package com.liu.cloudnote.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import org.apache.tomcat.util.codec.binary.Base64;

/**
 * 加密工具类
 * @author liu
 * 2016年12月1日
 */
public class NoteUtils {
	/**
	 * 密码加密处理
	 * 
	 * @param src
	 *            明文
	 * @return 密文
	 * @throws NoSuchAlgorithmException
	 */
	public static String md5(String src) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] input = src.getBytes();
		byte[] output = md.digest(input);
		// 采用Base64将output转换为字符串
		String dest = Base64.encodeBase64String(output);
		return dest;
	}

	/**
	 * 
	 * 生成表的主键ID
	 */
	public static String createId() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}

	public static void main(String[] args) throws NoSuchAlgorithmException {
		String s = md5("123456");
		System.out.println(s);
	}
}

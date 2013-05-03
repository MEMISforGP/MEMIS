package com.xiaocq.logic;

import java.security.MessageDigest;

import com.xiaocq.log.Logs;

public class EncryptHelper {
	private EncryptHelper(){};
	
	public static String getEncryptHelper(String pwd){
		StringBuilder builder = new StringBuilder(32);
		try{
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] array = md.digest(pwd.getBytes("utf-8"));
			for(int i=0; i<array.length; i++){
				builder.append(Integer.toHexString((array[i] & 0xFF) | 0x100).toUpperCase().substring(1, 3));
			}
		}catch(Exception e){
			Logs.getLog().error("Can not encoding String " + pwd + "to MD5", e);
			return null;
		}
		
		return builder.toString();
	}
}

package com.xiaocq.util;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class CodeUtil {
	private static final String PASSWORD_KEY = "aBcDeFgHiJkLmNoP";

	public static String getDecryptCode(String password) {
		String result = password;

		Cipher cipher;
		try {
			cipher = Cipher.getInstance("AES");
			Key key = new SecretKeySpec(PASSWORD_KEY.getBytes(), "AES");
			cipher.init(Cipher.DECRYPT_MODE, key);
			result = new String(cipher.doFinal(password.getBytes()));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}

		return result;
	}

	public static String getEncryptCode(String password) {
		String result = password;
		try {
			Cipher cipher = Cipher.getInstance("AES");
			Key key = new SecretKeySpec(PASSWORD_KEY.getBytes(), "AES");
			cipher.init(Cipher.ENCRYPT_MODE, key);
			result = new String(cipher.doFinal(password.getBytes()));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}

		return result;
	}
}

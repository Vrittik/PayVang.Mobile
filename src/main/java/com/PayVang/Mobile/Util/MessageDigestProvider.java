package com.PayVang.Mobile.Util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.EmptyStackException;
import java.util.Stack;

import com.PayVang.Mobile.Constants.ConfigurationConstants;
import com.PayVang.Mobile.CustomExceptions.UnauthorizedException;

public class MessageDigestProvider {
	private static Stack<MessageDigest> stack = new Stack<MessageDigest>();

	public static MessageDigest provide() 
	{
		MessageDigest digest = null;
		try {
			digest = stack.pop();
		} catch (EmptyStackException emptyStackException) {
			try {
				digest = MessageDigest.getInstance(ConfigurationConstants.HASHING_ALGORITHAM.getValue());
			} catch (NoSuchAlgorithmException noSuchAlgorithmException) {
				throw new UnauthorizedException("Hashing algoritham not found");
			}
		}

		return digest;
	}

	public static void consume(MessageDigest digest) {
		stack.push(digest);
	}
}

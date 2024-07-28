package com.PayVang.Mobile.Util;

import java.security.MessageDigest;

import org.apache.commons.codec.binary.Hex;

public class Hasher {

	public Hasher() {
	}

	public static String getHash(String input)
	{
		String response = null;
		MessageDigest messageDigest = MessageDigestProvider.provide();
		messageDigest.update(input.getBytes());
		MessageDigestProvider.consume(messageDigest);

		response = new String(Hex.encodeHex(messageDigest.digest()));
		return response.toUpperCase();
	}
}
package com.PayVang.Mobile.Util;

import com.PayVang.Mobile.CustomExceptions.UnauthorizedException;
import com.PayVang.Mobile.Properties.PropertiesManager;

public class PasswordHasher {

	public static String hashPassword(String password,String appId)
	{
	
		String salt = (new PropertiesManager()).getSalt(appId);	
		if(null==salt){
			throw new UnauthorizedException("Invalid app id");
		}
		
		String hashedPassword = Hasher.getHash(password.concat(salt));		
		return hashedPassword;		
	}		
}
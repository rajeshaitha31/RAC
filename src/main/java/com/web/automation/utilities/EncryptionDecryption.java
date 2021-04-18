package com.web.automation.utilities;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.*;
import com.web.automation.accelerators.ActionsLibrary;


public class EncryptionDecryption extends ActionsLibrary
{
	private static final String ALGO = "AES";
	private static final byte[] keyValue = new byte[] { 'T', 'h', 'e', 'B', 'e', 's', 't','S', 'e', 'c', 'r','e', 't', 'K', 'e', 'y' };

	/**
	 * @author ashish jain
	 * @param Data
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("restriction")
	public static String encrypt(String Data) throws Exception 
	{
		Key key = generateKey();
		Cipher c = Cipher.getInstance(ALGO);
		c.init(Cipher.ENCRYPT_MODE, key);
		byte[] encVal = c.doFinal(Data.getBytes());
		String encryptedValue = new BASE64Encoder().encode(encVal);
		return encryptedValue;
	}

	/**
	 * @author ashish jain
	 * @param encryptedData
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("restriction")
	public static String decrypt(String encryptedData) throws Exception
	{
		Key key = generateKey();
		Cipher c = Cipher.getInstance(ALGO);
		c.init(Cipher.DECRYPT_MODE, key);
		byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
		byte[] decValue = c.doFinal(decordedValue);
		String decryptedValue = new String(decValue);
		return decryptedValue;
	}
	
	/**
	 * @author ashish jain
	 * @return
	 * @throws Exception
	 */
	private static Key generateKey() throws Exception
	{
		Key key = new SecretKeySpec(keyValue, ALGO);
		return key;
	}
}
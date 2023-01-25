package com.ceragem.config;

import org.jasypt.encryption.StringEncryptor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JasyptEncryptorTest {

	public static void main(String[] args) {

		StringEncryptor encryptor = new JasyptConfiguration().stringEncryptor();

		String pwd = "ASMOWN";
		log.debug("enc config : ENC(" + encryptor.encrypt(pwd) + ")");
	}

}

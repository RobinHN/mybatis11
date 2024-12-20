package com.example.mybatis11.service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class GenerateChatroomIdService {

	private final MessageDigest digest;

	public GenerateChatroomIdService() {
		try {
			this.digest = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("SHA-256 algorithm not available", e);
		}
	}

	public String generateChatroomId() {
		UUID uuid = UUID.randomUUID();
		byte[] hash = digest.digest(uuid.toString().getBytes(StandardCharsets.UTF_8));

		StringBuilder chatroomId = new StringBuilder();
		for (int i = 0; i < 8; i++) { // Use 8 bytes for lower collision risk
			chatroomId.append(String.format("%02x", hash[i]));
		}

		return chatroomId.toString();
	}
}

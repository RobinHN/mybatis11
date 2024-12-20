package com.example.mybatis11.dao;



import com.example.mybatis11.dto.Chat;

public interface ChatDao {

	// define the method and parameter
	// chatType decides chatDetail and chatImage which one will be null
	// if send image, chatDetail will be null
	// verse visa, if send text, chatImage will be null
//	public int saveChat(int chatId, String invitation, String chatType, String chatDetail, 
//			String chatImage, LocalDateTime chatTime, String userMail);
	
	public int saveChat(Chat chat);
}
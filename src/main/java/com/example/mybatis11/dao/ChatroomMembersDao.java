package com.example.mybatis11.dao;

import com.example.mybatis11.dto.ChatroomMembers;

public interface ChatroomMembersDao {

//	public int createChatroom(int journeyId, String invitation, String userMail);
	
	public int createChatroom(ChatroomMembers chatroomMember);
}

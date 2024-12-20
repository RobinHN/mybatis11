package com.example.mybatis11.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.mybatis11.dto.PersonInfo1;

@Mapper // assign this under the supervision of Spring Boot
public interface PersonInfo1Dao {

	public List<PersonInfo1> selectByCityLike(String keyword);
	
	public List<PersonInfo1> selectByUserNameAndCitysIn(String userName, List<String> keywordList);
}

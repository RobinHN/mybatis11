package com.example.mybatis11;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mybatis11.dao.ChatDao;
import com.example.mybatis11.dao.PersonInfo1Dao;
import com.example.mybatis11.dao.PersonInfo2Dao;
import com.example.mybatis11.dao.PersonInfoDao;
import com.example.mybatis11.dto.Chat;
import com.example.mybatis11.dto.PersonInfo;
import com.example.mybatis11.dto.PersonInfo1;

@SpringBootTest
class Mybatis11ApplicationTests {
	
	@Autowired
	private PersonInfoDao personInfoDao;
	
	@Autowired
	private PersonInfo1Dao personInfo1Dao;
	
	@Autowired
	private PersonInfo2Dao personInfo2Dao;
	
//	@Autowired
//	private ChatDao chatDao;
	
	@Test
	public void addInfo1Test() {
		personInfoDao.addInfo1("A04", "John", 20, "Tainan");
	}
	
	@Test
	public void addInfo2Test() {
		personInfoDao.addInfo2(new PersonInfo("A02", "Sam", 23, "Taipei"));
	}

	
	@Test
	public void selectTest1() {
		Map<String, Object> map = new HashMap<>();
		map.put("userName", "Sam");
		map.put("city", "Taipei");
		List<PersonInfo> res = personInfoDao.findByUserNameAndCity(map);
		System.out.println("res size: " + res.size());
	}
	
	@Test
	public void selectTest2() {
		List<PersonInfo> res = personInfoDao.selectByUserNameAndCity("Sam", "Taipei");
		System.out.println("res size: " + res.size());
	}
	
	@Test
	public void selectTest3() {
		List<PersonInfo> res = personInfoDao.selectByIdList(List.of("A01", "A02"));
		System.out.println("res size: " + res.size());
	}
	
	@Test
	public void selectTest4() {
		List<PersonInfo> res = personInfoDao.selectByIds(List.of("A01", "A02"));
		System.out.println("res size: " + res.size());
	}
	
	@Test
	public void selectTest5() {
		List<PersonInfo1> res = personInfo1Dao.selectByCityLike("Tai");
		System.out.println("res size: " + res.size());
	}
	
	
	@Test
	public void selectTest6() {
		List<PersonInfo1> res = personInfo1Dao.selectByUserNameAndCitysIn("Sam", List.of("Taipei"));
		System.out.println("res size: " + res.size());
	}
	
	@Test
	public void insert2Test() {
		personInfo2Dao.addInfo2(new PersonInfo("A05", "Samuel", 27, "Taichung"));
	}
	
//	@Test
//	public void test1() {
//		chatDao.saveChat(new Chat());
//		System.out.println("res size");
//	}
	
	@Test
	void contextLoads() {
	}

}

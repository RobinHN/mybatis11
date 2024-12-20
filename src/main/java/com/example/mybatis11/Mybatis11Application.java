package com.example.mybatis11;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//���w�n���y Mapper �����f�����|��m�A�N�O�� Dao �� package
//���|�u���@�ӮɡA�A�����i��������|�F�Ҧp: @MapperScan("com.example.mybatis.dao")
//���|�h�Ӯɥγr�����j: {"���|A", "���|B"}
@MapperScan(basePackages = {"com.example.mybatis11.dao"})
@SpringBootApplication
public class Mybatis11Application {

	public static void main(String[] args) {
		SpringApplication.run(Mybatis11Application.class, args);
	}

}

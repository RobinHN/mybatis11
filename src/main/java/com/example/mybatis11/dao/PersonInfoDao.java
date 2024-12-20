package com.example.mybatis11.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.mybatis11.dto.PersonInfo;

@Mapper // assign this under the supervision of Spring Boot
public interface PersonInfoDao {

	// ��k���Ѽƪ��ǻ����H�U�X�ر`�Ϊ��覡:
	// 1. �ϥ� @Param �N�a�J���ȬM�g��ѼƤ�
	public void addInfo1(//
			@Param("inputId") String id, //
			@Param("inputName") String userName, //
			@Param("inputAge") int userAge, //
			@Param("inputCity") String city);
	
	// 2. �ϥ� dto
	// ��: �^�Ǹ�ƫ��A�]�w�� int�A�i�H�ΨӧP�_�O�_�� insert ���\
	//     �]���O�s�W�浧��ơA�ҥH�^�� 1 ��ܷs�W���\�F�Ϥ��s�W����
	public int addInfo2(PersonInfo personInfo);
	
	// 3. �ϥ�Map�覡: ����� userName �M city ��J Map ��
	// Map �� k-v ��ƫ��A: Map<String, Object>
	// �]���o�Ӥ�k�ѼƦC�ϥΪ��覡��Map�A�ҥH#{}�����ѼƦW�ٷ|�OMap ���� key
	// �Ҧp: map.put("userName", "AAA"); map.put("city", "Tainan")
	public List<PersonInfo> findByUserNameAndCity(Map<String, Object> paramMap);
	
	// 4. �ϥΰѼƦC����m�Aindex �q 0 �}�l
	public List<PersonInfo> selectByUserNameAndCity(String userName, String city);
	
	// 5. ��k���ѼƬO���X����(List, Set etc)�A�Ѽƨϥ� @Param �M�g
	public List<PersonInfo> selectByIdList(@Param("inputIdList") List<String> idList);
	
	// 5.1 ��k���ѼƬO���X����(List, Set etc)
	public List<PersonInfo> selectByIds(List<String> idList);
	
}

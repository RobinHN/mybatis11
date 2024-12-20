package com.example.mybatis11.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.mybatis11.dto.PersonInfo;

@Mapper // assign this under the supervision of Spring Boot
public interface PersonInfoDao {

	// 方法中參數的傳遞有以下幾種常用的方式:
	// 1. 使用 @Param 將帶入的值映射到參數中
	public void addInfo1(//
			@Param("inputId") String id, //
			@Param("inputName") String userName, //
			@Param("inputAge") int userAge, //
			@Param("inputCity") String city);
	
	// 2. 使用 dto
	// 註: 回傳資料型態設定為 int，可以用來判斷是否有 insert 成功
	//     因為是新增單筆資料，所以回傳 1 表示新增成功；反之新增失敗
	public int addInfo2(PersonInfo personInfo);
	
	// 3. 使用Map方式: 把條件 userName 和 city 放入 Map 中
	// Map 的 k-v 資料型態: Map<String, Object>
	// 因為這個方法參數列使用的方式為Map，所以#{}中的參數名稱會是Map 中的 key
	// 例如: map.put("userName", "AAA"); map.put("city", "Tainan")
	public List<PersonInfo> findByUserNameAndCity(Map<String, Object> paramMap);
	
	// 4. 使用參數列的位置，index 從 0 開始
	public List<PersonInfo> selectByUserNameAndCity(String userName, String city);
	
	// 5. 方法的參數是集合類型(List, Set etc)，參數使用 @Param 映射
	public List<PersonInfo> selectByIdList(@Param("inputIdList") List<String> idList);
	
	// 5.1 方法的參數是集合類型(List, Set etc)
	public List<PersonInfo> selectByIds(List<String> idList);
	
}

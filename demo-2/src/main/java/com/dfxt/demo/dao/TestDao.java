package com.dfxt.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.dfxt.demo.entity.Test;

@Mapper
public interface TestDao {
	                                                
	
	@Select(" SELECT * FROM testa ")
	List<Test> SelectTest();
	
	@Insert(" INSERT INTO TESTA(testId,testName) VALUES(#{t.testId},#{t.testName})")
	int SaveTest(@Param("t")Test test);
	 
}

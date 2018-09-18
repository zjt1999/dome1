package com.dfxt.demo.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dfxt.demo.dao.TestDao;
import com.dfxt.demo.entity.Test;
import com.dfxt.demo.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testDao;

 	@Override
	public int SaveTest(Test test) {
  	test.setTestId(UUID.randomUUID().toString().replaceAll("-", ""));
 	return testDao.SaveTest(test);
 	}

	@Override
	public List<Test> SeleteTest() {
 		return testDao.SelectTest();
	}
	
	

	
	
	
}

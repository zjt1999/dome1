package com.dfxt.demo.service;

import java.util.List;

import com.dfxt.demo.entity.Test;

public interface TestService {

	int SaveTest(Test test);

	List<Test> SeleteTest();

}

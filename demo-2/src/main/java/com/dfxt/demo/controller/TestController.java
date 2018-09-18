package com.dfxt.demo.controller;

import java.util.List;

 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beust.jcommander.ParameterException;
import com.dfxt.demo.entity.Test;
import com.dfxt.demo.service.TestService;
import com.dfxt.demo.utli.ResultModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestController {
	
	
    @Autowired
	private TestService testService;
	
 	@PostMapping("saveTest")
 	public ResultModel SaveTest(Test test) {
 		ResultModel resultModel=new ResultModel();

   		if (testService.SaveTest(test)==1) {	
			resultModel.setMessage("新增成功");	
		}else {
			resultModel.setMessage("新增失败");
		}
		
		return resultModel;
 	}
	
	
 	@GetMapping("selectTest")
 	public ResultModel SelectTest() {
 		ResultModel resultModel=new ResultModel();
 		List<Test> test = null;
  		try {
  			 test=testService.SeleteTest();
  		}catch (ParameterException e) {
   			log.error("关键字错误-已知异常类型  参数为:"+e.getMessage());
    		resultModel.setError("o类型异常:"+e.getMessage());
  	 		return resultModel;

 		}
 		if (test.isEmpty()) {			
			resultModel.setMessage("没有搜索到相关数据");
		}else {
			resultModel.setDatas(test);
		}	
		
		
 		return resultModel;
	}
	
	@GetMapping("viewPage")
 	public String viewPage() {
		return "newFile.ftl";
	}
}

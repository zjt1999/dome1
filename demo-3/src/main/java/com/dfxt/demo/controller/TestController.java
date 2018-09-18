package com.dfxt.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dfxt.demo.entity.Test;
import com.dfxt.demo.utli.ResultModel;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

 
@RestController
public class TestController {

    HttpClient client = new HttpClient();

	@PostMapping("testClient")
	public void testHttpClient(String testName) {
		
		
 	        String url = "http://localhost:8081/saveTest";
	        Map<String,String> params = new HashMap<>();
	        params.put("testName",testName);
	        HttpClient client = new HttpClient();
	        String result = client.doPost(url,params,"UTF-8");
	        System.out.println(result);
 	}
	
	
	

	@PostMapping("testClientGet")
	public ResultModel testClientGet() {
 		ResultModel resultModel=new ResultModel();
  	   String url = "http://localhost:8081/selectTest";
       Map<String,String> params = new HashMap<>();
       String result = client.doPost(url,params,"UTF-8");
        System.out.println(result);
   		if (result.isEmpty()) {			
			resultModel.setMessage("没有搜索到相关数据");
		}else {
			resultModel.setDatas(result);
		}	
	        System.out.println(result);
	        
			return resultModel;
 	}
	@PostMapping("testRestTemplate")
	public ResultModel tesstClientGet() {
		RestTemplate restTemplate=new RestTemplate();
 		ResultModel resultModel=new ResultModel();
 		List<Test> test3 =new  ArrayList<Test>();
 		
 		
 		
 	  	   String url = "";
	       Map<String,String> params = new HashMap<>();
	       ResultModel body = restTemplate.getForEntity("http://localhost:8081/selectTest", ResultModel.class).getBody();
 	       List<Object> test = Arrays.asList(body.getDatas());
    		 
	   		resultModel.setDatas(test);
	        System.out.println(test);
	        
	  
			 return resultModel;
 	}
	
	
	
	
	
	
	
	
	
}

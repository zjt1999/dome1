package com.dfxt.demo.utli;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.stereotype.Service;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultModel {
	//private int code;
	private String message;
	private String error;
	private Object datas;
}

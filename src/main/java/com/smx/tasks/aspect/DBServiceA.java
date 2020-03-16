package com.smx.tasks.aspect;

import org.springframework.stereotype.Component;

@Component
public class DBServiceA {
	public String getData(int id) {
		/* assume that some data has been retrieved from DB by id */
		String resultData = "resultData";
		return resultData;
	}

}

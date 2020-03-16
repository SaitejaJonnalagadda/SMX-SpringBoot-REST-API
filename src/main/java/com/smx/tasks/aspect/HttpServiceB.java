package com.smx.tasks.aspect;

import org.springframework.stereotype.Component;

@Component
public class HttpServiceB {
	public String sendMessage(String message) {
		/*
		 * assume that some message sends via rest client and gets "httpResponse"
		 */
		String httpResponse = "httpResponse";
		return httpResponse;
	}

}

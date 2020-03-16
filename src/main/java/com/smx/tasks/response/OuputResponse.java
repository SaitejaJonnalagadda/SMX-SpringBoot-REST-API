package com.smx.tasks.response;

public class OuputResponse {
private Long statusCode;
	
	private String id;
	
	public OuputResponse(Long statusCode, String id) {
		this.statusCode = statusCode;
		this.id = id;
	}

	public Long getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Long statusCode) {
		this.statusCode = statusCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


}

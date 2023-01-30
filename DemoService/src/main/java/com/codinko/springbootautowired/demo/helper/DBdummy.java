package com.codinko.springbootautowired.demo.helper;

import org.springframework.stereotype.Component;

@Component
public class DBdummy {

	private String dbContent;

	public String getDbContent() {
		return dbContent;
	}

	public void setDbContent(String dbContent) {
		this.dbContent = dbContent;
	}

}

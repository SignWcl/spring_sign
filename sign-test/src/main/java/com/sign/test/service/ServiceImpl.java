package com.sign.test.service;


import org.springframework.stereotype.Component;

@Component("service")
public class ServiceImpl implements Service {

	@Override
	public void query() {
		System.out.println("query");
	}
}

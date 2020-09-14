package com.sign.test;

import com.sign.test.service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Service bean = (Service) annotationConfigApplicationContext.getBean("service");
		System.out.println("==============" + bean.getClass().getName());
		bean.query();
		System.in.read();
	}
}

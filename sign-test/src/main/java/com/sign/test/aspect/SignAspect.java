package com.sign.test.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SignAspect {

	@Pointcut("execution(* com.sign.test.service.*.*(..))")
	public void pointcut(){}

	@Before("pointcut()")
	public void before(){
		System.out.println("service方法执行之前");
	}

}

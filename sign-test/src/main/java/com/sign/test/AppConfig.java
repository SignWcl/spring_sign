package com.sign.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.sign")
@EnableAspectJAutoProxy(proxyTargetClass = true)
//@EnableAspectJAutoProxy
public class AppConfig {

}

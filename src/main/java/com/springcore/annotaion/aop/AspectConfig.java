package com.springcore.annotaion.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy // Enable support for handling components marked with @Aspect annotation
public class AspectConfig {
}

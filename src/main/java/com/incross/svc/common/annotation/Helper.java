package com.incross.svc.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

/**
 * @FileName : Helper.java
 * @Project : myProject
 * @Date : 2013. 1. 10.
 * @작성자 : 이남규
 * @프로그램설명 : Helper 전용 커스텀 애노테이션
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface Helper {
	String value() default "";
}

package com.incross.svc.common.aop;

import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;

import com.incross.svc.common.annotation.AOP;

/**
 * @FileName : LoggingAOP.java
 * @Project : IncrossSpring
 * @Date : 2012. 12. 26.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
@AOP
public class LoggingAOP {

	private static Logger log = LoggerFactory.getLogger(LoggingAOP.class);

	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		String className = pjp.getTarget().getClass().getSimpleName();
		String methodName = pjp.getSignature().getName();
		Object[] params = pjp.getArgs();
		String values = StringUtils.EMPTY;

		if (params != null) {
			for (int i = 0; i < params.length; i++) {
				values += params[i] + ",";
			}
		}

		if (values != null && values.length() > 0) {
			values = values.substring(0, values.length() - 1);
		}

		StopWatch watch = new StopWatch();
		log.info("#IN#[" + className + "." + methodName + "]");

		Object obj = null;
		try {
			watch.start();
			obj = pjp.proceed();
		} finally {
			watch.stop();
			log.info("#OUT#[" + className + "." + methodName + "] " + "(" + watch.getTotalTimeMillis() + "ms)");
		}

		return obj;
	}

}

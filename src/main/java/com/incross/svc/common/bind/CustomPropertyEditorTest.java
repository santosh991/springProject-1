package com.incross.svc.common.bind;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

/**
 * @FileName : CustomPropertyEditorTest.java
 * @Project : myProject
 * @Date : 2013. 1. 22.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
public class CustomPropertyEditorTest implements WebBindingInitializer {

	/**
	 * <pre>
	 * initBinder
	 *
	 * <pre>
	 * @param binder
	 * @param request
	 */
	@Override
	public void initBinder(WebDataBinder binder, WebRequest request) {
	}

}

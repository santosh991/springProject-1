package com.incross.svc.common.exception;

/**
 * @FileName : BusinessLogicException.java
 * @Project : IncrossSpring
 * @Date : 2012. 12. 5.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
public class BusinessLogicException extends RuntimeException {

	private static final long serialVersionUID = -8504141545544972077L;

	public BusinessLogicException() {
		super();
	}

	public BusinessLogicException(String msg) {
		super(msg);
	}

	public BusinessLogicException(Throwable throwable) {
		super(throwable);
	}
}

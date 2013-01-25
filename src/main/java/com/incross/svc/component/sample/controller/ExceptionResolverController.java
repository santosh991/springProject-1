package com.incross.svc.component.sample.controller;

import java.io.FileNotFoundException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.incross.svc.common.exception.BusinessLogicException;

/**
 * @FileName : ExceptionResolverController.java
 * @Project : IncrossSpring
 * @Date : 2012. 12. 5.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
@Controller
@RequestMapping("/exception")
public class ExceptionResolverController {

	/**
	 * <pre>
	 * businessEx
	 * AnnotationMethodHandlerExceptionResolver에서 에러 catch
	 * <pre>
	 */
	@RequestMapping(value = "/businessEx1", method = RequestMethod.GET)
	public void businessEx(HttpServletRequest req) {
		throw new BusinessLogicException("business logic error : 한글 왜 안 나와?");
	}

	@ExceptionHandler(BusinessLogicException.class)
	@ResponseBody
	public String error(BusinessLogicException ex, HttpServletResponse response) {
		response.setStatus(HttpStatus.BAD_GATEWAY.value());
		return ex.getMessage();
	}

	// -------------------------------------------------------------------------

	/**
	 * <pre>
	 * businessEx3
	 * SimpleMappingExceptionResolver에서 에러 catch
	 * <pre>
	 */
	@RequestMapping(value = "/businessEx2", method = RequestMethod.GET)
	public void businessEx3(HttpServletRequest req) {
		req.setAttribute("msg", "한글테스트");
		throw new RuntimeException();
	}

	// -------------------------------------------------------------------------

	/**
	 * <pre>
	 * defaultEx
	 * SimpleMappingExceptionResolver에서 에러 catch
	 * <pre>
	 * @throws FileNotFoundException
	 */
	@RequestMapping(value = "/defaultEx", method = RequestMethod.GET)
	public void defaultEx() throws FileNotFoundException {
		throw new FileNotFoundException();
	}

}

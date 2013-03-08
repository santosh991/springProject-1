package com.incross.svc.common.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class InitServlet
 */
public class InitServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(InitServlet.class);


	/**
	 * <pre>
	 * init
	 *
	 * <pre>
	 * @param config
	 * @throws ServletException
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		logger.info("===================================================");
		logger.info("Spring Project Started!!");
		logger.info("===================================================");
	}

	/**
	 * <pre>
	 * destroy
	 *
	 * <pre>
	 */
	@Override
	public void destroy() {
		logger.info("===================================================");
		logger.info("Spring Project Stoped!!");
		logger.info("===================================================");
	}
}

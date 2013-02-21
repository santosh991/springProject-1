package other;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @FileName : LogbackTest.java
 * @Project : springProject
 * @Date : 2013. 2. 20.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
public class LogbackTest {

	@Test
	@Ignore
	public void logbackTest() throws InterruptedException {
		Logger logger = LoggerFactory.getLogger(LogbackTest.class);
		while (true) {
			logger.info("#hello world : " + System.currentTimeMillis());
			Thread.sleep(100);
		}
	}
}

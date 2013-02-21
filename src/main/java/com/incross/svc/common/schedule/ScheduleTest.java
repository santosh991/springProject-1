package com.incross.svc.common.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

import com.incross.svc.common.annotation.Batch;

/**
 * @FileName : ScheduleTest.java
 * @Project : IncrossSpring
 * @Date : 2012. 12. 26.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
@Batch
public class ScheduleTest {

	private final Logger logger = LoggerFactory.getLogger(ScheduleTest.class);

	@Scheduled(fixedDelay = 60000)
	public void testSchedule1() {
		logger.info("testSchedule1 스케줄 실행");
	}

	@Scheduled(cron = "${cron.time}")
	public void testSchedule3() {
		logger.info("testSchedule3 스케줄 실행합니다.");
	}
}

package com.incross.svc.common.schedule;

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

	@Scheduled(fixedDelay = 60000)
	public void testSchedule1() {
		System.out.println("testSchedule1 스케줄 실행");
	}

	@Scheduled(cron = "${cron.time}")
	public void testSchedule3() {
		System.out.println("testSchedule3 스케줄 실행합니다.");
	}
}

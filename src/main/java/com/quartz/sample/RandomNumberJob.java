package com.quartz.sample;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

@Component
public class RandomNumberJob extends QuartzJobBean {

	@Autowired
	private RandomClientService service;

	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		System.out.println("Job starting -> " + context.getFireTime());
		System.out.println("Random number -- " +service.getRandomNumber());
		System.out.println("Next job scheduled at ->" + context.getNextFireTime());
}

}
package com.example.springbootdemoquartz.demos.web;

import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

@Component
public class QuartzTestJob1 extends QuartzJobBean {
    @Override
    protected void executeInternal(org.quartz.JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("Quartz Test Job1");
    }
}

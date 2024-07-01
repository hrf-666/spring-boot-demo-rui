package com.example.springbootdemoquartz.config;

import com.example.springbootdemoquartz.demos.web.QuartzTestJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzTestJobConfig {
    @Bean
    public JobDetail quartzTestJobDetail() {
        return JobBuilder.newJob(QuartzTestJob.class)
                .withIdentity(QuartzTestJob.class.getSimpleName())
                .storeDurably()
                .usingJobData("data", "test")
                .build();
    }

    @Bean
    public Trigger quartzTestJobTrigger() {
        // 0/1 * * * * ?
        return TriggerBuilder.newTrigger()
                .forJob(QuartzTestJob.class.getSimpleName())
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(1).repeatForever())
                .build();
    }
}

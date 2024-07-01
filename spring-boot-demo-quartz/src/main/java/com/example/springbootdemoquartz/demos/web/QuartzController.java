package com.example.springbootdemoquartz.demos.web;

import com.example.springbootdemoquartz.dto.QuartzJobDetailDto;
import com.example.springbootdemoquartz.pojo.QuartzCreateParam;
import com.example.springbootdemoquartz.pojo.QuartzDetailParam;
import com.example.springbootdemoquartz.pojo.QuartzUpdateParam;
import com.example.springbootdemoquartz.service.impl.QuartzServiceImpl;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuartzController {
    @Autowired
    private QuartzServiceImpl quartzService;

    @PostMapping("/quartz/addJob")
    public void addJob(@RequestBody QuartzCreateParam param) throws SchedulerException {
        quartzService.addJob(param);
    }

    @PostMapping("/quartz/updateJob")
    public void updateJob(@RequestBody QuartzUpdateParam param) throws SchedulerException {
        quartzService.updateJob(param);
    }

    @PostMapping("/quartz/pauseJob")
    public void pauseJob(@RequestBody QuartzDetailParam param) throws SchedulerException {
        quartzService.pauseJob(param);
    }

    @PostMapping("/quartz/resumeJob")
    public void resumeJob(@RequestBody QuartzDetailParam param) throws SchedulerException {
        quartzService.resumeJob(param);
    }

    @PostMapping("/quartz/deleteJob")
    public void deleteJob(@RequestBody QuartzDetailParam param) throws SchedulerException {
        quartzService.deleteJob(param);
    }

    @PostMapping("/quartz/jobList")
    public List<QuartzJobDetailDto> jobList() throws SchedulerException {
        return quartzService.jobList();
    }

    @PostMapping("/quartz/jobDetail")
    public QuartzJobDetailDto jobDetail(@RequestBody QuartzDetailParam param) throws SchedulerException {
        return quartzService.jobDetail(param);
    }
}

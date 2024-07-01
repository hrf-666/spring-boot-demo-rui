package com.example.springbootdemoquartz.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.Date;
import java.util.List;

@ApiModel(value = "Quartz定时任务触发器详情类")
@Data
public class QuartzTriggerDetailDto {
    private String triggerName;
    private String triggerGroup;
    private String cron;
    private String description;

    private String triggerState;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private List<Date> recentFireTimeList;
}

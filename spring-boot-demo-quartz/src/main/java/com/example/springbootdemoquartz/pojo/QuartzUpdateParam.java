package com.example.springbootdemoquartz.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;

@ApiModel(value = "Quartz任务更新请求参数")
public class QuartzUpdateParam extends BaseParam {
    @NotBlank(message = "任务类名不能为空")
    @ApiModelProperty(value = "任务类名", required = true)
    private String jobName;

    @ApiModelProperty(value = "任务组名，命名空间")
    private String jobGroup;

    @ApiModelProperty(value = "cron表达式")
    private String cron;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }
}

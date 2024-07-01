package com.example.springbootdemoquartz.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;

@ApiModel(value = "Quartz任务详情请求参数")
public class QuartzDetailParam extends BaseParam {
    @NotBlank(message = "任务类名不能为空")
    @ApiModelProperty(value = "任务类名", required = true)
    private String jobName;

    @ApiModelProperty(value = "任务组名，命名空间")
    private String jobGroup;


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
}

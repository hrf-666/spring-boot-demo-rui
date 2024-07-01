package com.example.springbootdemoquartz.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;

import java.util.Map;

@ApiModel(value = "Quartz任务添加请求参数")
public class QuartzCreateParam extends BaseParam {
    @NotBlank(message = "任务类不能为空")
    @ApiModelProperty(value = "任务类路径", required = true)
    private String jobClazz;

    @NotBlank(message = "任务类名不能为空")
    @ApiModelProperty(value = "任务类名", required = true)
    private String jobName;

    /**
     * 组名+任务类key组成唯一标识，所以如果这个参数为空，那么默认以任务类key作为组名
     */
    @ApiModelProperty(value = "任务组名，命名空间")
    private String jobGroup;

    @ApiModelProperty(value = "任务数据")
    private Map<String, Object> jobDataMap;

    @ApiModelProperty(value = "cron表达式")
    private String cron;

    @ApiModelProperty(value = "描述")
    private String description;

    public String getJobClazz() {
        return jobClazz;
    }

    public void setJobClazz(String jobClazz) {
        this.jobClazz = jobClazz;
    }

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

    public Map<String, Object> getJobDataMap() {
        return jobDataMap;
    }

    public void setJobDataMap(Map<String, Object> jobDataMap) {
        this.jobDataMap = jobDataMap;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

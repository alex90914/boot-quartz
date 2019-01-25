package com.dream.quartz.job;

import com.alibaba.fastjson.JSON;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author: wubo
 * @Date: 2019-01-24
 * @Time: 17:06
 * @Email: 343618924@qq.com
 * @Desc:
 */
public class MyJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();
        Object params = jobDataMap.get("params");
        System.out.println("你好啊 : 参数为 --" + JSON.toJSONString(params));
    }
}

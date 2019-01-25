package com.dream.quartz.job;

import org.quartz.Job;
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
        System.out.println("你好啊");
    }
}

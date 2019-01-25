package com.dream.quartz.config;

import org.springframework.boot.autoconfigure.quartz.SchedulerFactoryBeanCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * @author: wubo
 * @Date: 2019-01-24
 * @Time: 15:42
 * @Email: 343618924@qq.com
 * @Desc:
 */
@Configuration
public class QuartzConfig implements SchedulerFactoryBeanCustomizer {

    @Override
    public void customize(SchedulerFactoryBean schedulerFactoryBean) {
        schedulerFactoryBean.setStartupDelay(2);
        schedulerFactoryBean.setAutoStartup(true);
        schedulerFactoryBean.setOverwriteExistingJobs(true);
       //  schedulerFactoryBean.setDataSource();
    }

}

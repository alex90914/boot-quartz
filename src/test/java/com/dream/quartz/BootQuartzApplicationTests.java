package com.dream.quartz;

import com.dream.quartz.utils.QuartzUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootQuartzApplicationTests {


    @Autowired
    private SchedulerFactoryBean schedulerFactory;

    @Test
    public void testName() throws Exception {
        //schedulerFactory通过spring注入
        Scheduler sche = schedulerFactory.getScheduler();
        String job_name = "JOB_NAME";
        String clazz = "cn.itsource.aigou.job.MainJob";
        String cron = "/1 * * * * ? ";
        Map<String, Object> params = new HashMap<>();
        params.put("firstJob", 1);
        params.put("firstName", "myFirstName");
        QuartzUtils.addJob(sche, job_name, Class.forName(clazz), params, cron);
        Thread.sleep(10000);
        System.out.println("【移除定时】开始...");
        QuartzUtils.removeJob(sche, job_name);
        System.out.println("【移除定时】成功");
    }

}


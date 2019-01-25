package com.dream.quartz;

import com.dream.quartz.job.MyJob;
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
        Scheduler scheduler = schedulerFactory.getScheduler();
        String job_name = "JOB_NAME";
        String cron = "0/2 * * * * ? ";
        Map<String, Object> params = new HashMap<>();
        params.put("firstJob", 1);
        params.put("firstName", "myFirstName");
        QuartzUtils.addJob(scheduler, job_name, MyJob.class, params, cron);
      //  System.in.read();
    }
}


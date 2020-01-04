package com.kevin;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kevin
 * @ClassName
 * @Date 2019/12/721:05
 */
public class JobLaunch {


	public static void main(String[] args) {

        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:ch02/job/job.xml");
        JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("billJob");

        try {
            JobExecution result = launcher.run(job, new JobParameters());
            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

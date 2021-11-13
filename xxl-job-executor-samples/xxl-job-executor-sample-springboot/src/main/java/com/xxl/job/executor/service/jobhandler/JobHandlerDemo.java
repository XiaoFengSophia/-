package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class JobHandlerDemo{

    private static Logger logger = LoggerFactory.getLogger(JobHandlerDemo.class);

    @XxlJob(value = "demoJobHandler_1", init = "init", destroy = "destroy")
    public void execute() throws Exception {
        XxlJobHelper.log("XXL-JOB, Hello World!!!");
    }
    public void init(){
        logger.info("init......");
    }
    public void destroy(){
        logger.info("destroy......");
    }
}

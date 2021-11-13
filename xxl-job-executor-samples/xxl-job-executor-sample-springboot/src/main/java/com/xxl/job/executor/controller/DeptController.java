package com.xxl.job.executor.controller;

import com.xxl.job.executor.entity.OptResult;
import com.xxl.job.executor.service.DeptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DeptController {

    @Resource
    private DeptService deptService;

    @GetMapping("/xxl_job/getDept")
    public OptResult getDept(){

        return deptService.getDept();
    }
}

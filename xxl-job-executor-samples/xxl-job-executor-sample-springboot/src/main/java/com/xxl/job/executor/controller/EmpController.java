package com.xxl.job.executor.controller;

import com.xxl.job.executor.entity.OptResult;
import com.xxl.job.executor.service.EmpService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class EmpController {

    @Resource
    private EmpService empService;

    @GetMapping("/xxl_job/getEmp")
    public OptResult getEmp(){

        return empService.getEmp();
    }
}

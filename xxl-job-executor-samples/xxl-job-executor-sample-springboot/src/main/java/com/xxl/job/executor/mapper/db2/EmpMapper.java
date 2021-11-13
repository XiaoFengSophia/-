package com.xxl.job.executor.mapper.db2;

import com.xxl.job.executor.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmpMapper {

    List<Map<String, Object>> getEmp();
}

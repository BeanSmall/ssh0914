package com.bdqn.zhang.service.impl;

import com.bdqn.zhang.dao.DeptDao;
import com.bdqn.zhang.pojo.Dept;
import com.bdqn.zhang.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("deptService")
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptDao deptDao;

    @Override
    public Dept getDeptById() {
        return deptDao.getDeptById();
    }
}

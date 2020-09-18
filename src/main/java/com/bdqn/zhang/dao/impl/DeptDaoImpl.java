package com.bdqn.zhang.dao.impl;

import com.bdqn.zhang.dao.BaseDaoImpl;
import com.bdqn.zhang.dao.DeptDao;
import com.bdqn.zhang.pojo.Dept;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


@Repository("deptDao")
public class DeptDaoImpl extends BaseDaoImpl<Dept> implements DeptDao {

    @Override
    public Dept getDeptById() {
        return findById(1);
    }
}

package com.bdqn.zhang.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {
    /**
     * 新增
     *
     * @param entity
     */

    public void save(T entity);


    /**
     * 更新
     *
     * @param entity
     */

    public void update(T entity);


    /**
     * 根据id删除
     *
     * @param id
     */

    public void deleteById(Serializable id);


    /**
     * 通过id查找
     *
     * @param id
     * @return 实体
     */

    public T findById(Serializable id);


    /**
     * 查找所有
     *
     * @return List集合
     */

    public List<T> findAll();
}

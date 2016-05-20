package com.yt.permission.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by yitao on 2016/5/19.
 */
public interface BaseSqlDao<T, PK extends Serializable> {

    T get(PK id);

    T get(Map<String, Object> query);

    void delete(PK id);

    void delete(PK id, boolean isHardDelete);

    List<T> findAll();

    List<T> findAll(Boolean deleted);

    void save(T entity);

    void insert(T entity);

    void update(T entity);

    Long count();

    Long count(Map<String, Object> query);

    List<T> find(Map<String, Object> query);

}

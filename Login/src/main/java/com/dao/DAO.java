package com.dao;

import com.model.Student;

import java.util.ArrayList;

public interface DAO<T> {
    int insert(T t);

    int update(T t);

    int delete(T t);

    ArrayList<T> selectAll();

    Student selectByCondition(String condition);

    ArrayList<T> selectByTime();

    boolean checkLogin(String username, String password);
}

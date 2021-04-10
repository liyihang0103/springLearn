package com.yc.dao;

/**
 * @program: testspring
 * @description:
 * @author: liyihang
 * @create: 2021-04-04 14:46
 */
public interface StudentDao {

    public int add(String name);

    public void update(String name);

    public String find(String name);

}

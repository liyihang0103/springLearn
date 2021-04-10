package com.yc.dao;

import org.springframework.stereotype.Repository;

import java.util.Random;

/**
 * @program: testspring
 * @description:
 * @author: liyihang
 * @create: 2021-04-04 14:52
 */
@Repository   // 异化转变：从Exception 转为RuntimeException
public class StudentDaoMybatisImpl  implements  StudentDao{
    @Override
    public int add(String name) {
        {
            System.out.println(" mybatis 添加学生："+name);
            Random r =new Random();
            return r.nextInt();
        }
    }

    @Override
    public void update(String name) {
        System.out.println(" mybatis 更新学生："+name);
    }

    @Override
    public String find(String name) {
        System.out.println(" mybatis 查找学生："+name);
        return name;
    }
}

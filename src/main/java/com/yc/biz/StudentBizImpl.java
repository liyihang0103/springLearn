package com.yc.biz;

import com.sun.corba.se.impl.ior.StubIORImpl;
import com.yc.dao.StudentDao;
import com.yc.dao.StudentDaoJpalmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: testspring
 * @description:
 * @author: liyihang
 * @create: 2021-04-04 14:55
 */
@Service
public class StudentBizImpl {
    private StudentDao studentDao;

    public StudentBizImpl(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    public StudentBizImpl(){}

   @Autowired
   @Qualifier("studentDaoJpalmpl")
    public void setStudentDao(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    public int add(String name){
        System.out.println("======业务层=====");
        System.out.println("用户名是否重复");
        int result= studentDao.add(name);
        System.out.println("=====业务操作结束=====");
        return result;
    }

    public void update(String name){
        System.out.println("======业务层=====");
        System.out.println("用户名是否重复");
        studentDao.update(name);
        System.out.println("=====业务操作结束=====");
    }

    public void find(String name){
        System.out.println("======业务层=====");
        System.out.println("业务层查找用户名："+name);
        studentDao.find(name);
        System.out.println("=====业务操作结束=====");
    }

}

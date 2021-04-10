package com.yc.biz;

import org.springframework.stereotype.Component;

/**
 * @program: testspring
 * @description:
 * @author: liyihang
 * @create: 2021-04-04 15:12
 */
@Component
public class HelloWorld {
    public HelloWorld(){
        System.out.println("无参数的构造方法");
    }
    public void hello(){
        System.out.println("hello world");
    }


}

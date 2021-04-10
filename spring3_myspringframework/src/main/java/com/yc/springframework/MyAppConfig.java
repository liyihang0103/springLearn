package com.yc.springframework;

import com.yc.bean.HelloWorld;
import com.yc.springframework.stereotype.MyBean;
import com.yc.springframework.stereotype.MyComponentScan;
import com.yc.springframework.stereotype.MyConfiguration;

/**
 * @program: testspring
 * @description:
 * @author: liyihang
 * @create: 2021-04-05 14:38
 */
@MyConfiguration
@MyComponentScan(basePackages = {"com.yc.bean","com.yc.biz"})
public class MyAppConfig {

    @MyBean
    public HelloWorld hw(){
        return new HelloWorld();
    }

    @MyBean
    public HelloWorld hw2(){
        return new HelloWorld();
    }
}

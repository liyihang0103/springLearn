package com.yc;

import com.yc.biz.StudentBizImpl;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: testspring
 * @description:
 * @author: liyihang
 * @create: 2021-04-04 18:56
 */
@Configuration
@ComponentScan(basePackages = "com.yc")
public class AppConfig {

//    @Bean
//    public StudentBizImpl studentBizImpl(){
//        return new StudentBizImpl();
//    }

}

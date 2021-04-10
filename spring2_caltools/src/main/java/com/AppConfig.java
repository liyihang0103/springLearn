package com;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @program: testspring
 * @description:
 * @author: liyihang
 * @create: 2021-04-05 09:17
 */

@Configuration
@ComponentScan(basePackages = {"com.huwei","com.mimi"})
public class AppConfig {
}

package com.yc;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: testspring
 * @description:
 * @author: liyihang
 * @create: 2021-04-04 15:12
 */
@Configurable
@ComponentScan(basePackages = "com.yc")
public class AppConfig {
}

package com.yc.biz;

import com.yc.AppConfig;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class StudentBizImplTest  {
    @Resource(name="studentBizImpl")
    private StudentBizImpl sbi;

    @Test
    public void testAdd() {
        sbi.add("张三");
    }

    @Test
    public void testUpdate() {
        sbi.update("张三");
    }
    @Test
    public void testFind() {
        sbi.find("张三");
    }
}
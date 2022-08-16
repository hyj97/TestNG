package com.Casemeu.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;


public class testcase1 {
    @Test
    public void testcase3(){
        Assert.assertEquals("你好","你好", "测试用力断言你好相同");
    }
}

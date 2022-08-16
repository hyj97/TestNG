package com.testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
    @Test
    public void case1(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void case2(){
        Assert.assertEquals("hello","hello");;
    }
}
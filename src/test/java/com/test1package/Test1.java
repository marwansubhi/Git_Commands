package com.test1package;

import org.testng.annotations.*;

public class Test1 {

    @BeforeMethod
    public void setupMethod(){
        System.out.println("before method");
    }
    @BeforeClass
    public void setupClass(){
        System.out.println("before class");
    }

    @BeforeGroups
    public void setupGroup(){
        System.out.println("before group");
    }
    @BeforeTest
    public void setupTest(){
        System.out.println("Before test");
    }

    @BeforeSuite
    public void setupSuit(){
        System.out.println("before suit");
    }

    @AfterSuite
    public void tearSuit(){
        System.out.println("after suit");
    }

    @AfterTest
    public void tearTest(){
        System.out.println("after test");
    }
    @AfterMethod
    public void tearMethod(){
        System.out.println("after method");
    }

    @AfterClass
    public void tearClass(){
        System.out.println("after class");
    }
    @AfterGroups
    public void tearGroup(){

        System.out.println("after group");
    }

    @Test(groups = {"smoke"})
    public void test1(){
        System.out.println("Smoke testing");
    }


    @Test(groups = {"performance"})
    public void test2(){
        System.out.println("performance testing");
    }


    @Test(groups = {"regression"})
    public void test3(){
        System.out.println("regression testing");
    }

    @Test(groups = {"regression","smoke"})
    public void test4(){
        System.out.println("regression and smoke");
    }


    @Test(groups = {"regression","smoke","load"})
    public void test5(){
        System.out.println("regression and smoke and load");
    }

    @Test(groups = {"regression,smoke"})
    public void test6(){
        System.out.println("regression and smoke");
    }


    @Parameters({"username","password"})
    @Test(groups = {"performance"})
    public void testWithParameter(String x, String  r){

        System.out.println("login using "+x+ " and "+r);
        System.out.println("Test with parameters");

    }


}

package com.test2package;

import com.github.javafaker.Faker;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestC {

    Faker faker = new Faker();
    @Test(dataProvider = "dat")
    public void test(int n){

        System.out.println(n);


    }


    @DataProvider(name = "dat")
    public Object[] data(){

        Object[] arr = {1,2,3,4,5,6,7,8,9};
        return arr;

    }

    @Test(dataProvider = "info")
    public void test2(String names, String phoneNumbers){

        System.out.println("Name is "+names+" phone is "+phoneNumbers);

    }

    @DataProvider(name = "info")
    public Object [][] nameAndPhone(){

        return new Object[][]{
                {faker.name().firstName(),faker.phoneNumber().cellPhone()},
                {faker.name().firstName(),faker.phoneNumber().cellPhone()},
                {faker.name().firstName(),faker.phoneNumber().cellPhone()},
                {faker.name().firstName(),faker.phoneNumber().cellPhone()},
                {faker.name().firstName(),faker.phoneNumber().cellPhone()},
                {faker.name().firstName(),faker.phoneNumber().cellPhone()},
                {faker.name().firstName(),faker.phoneNumber().cellPhone()},
                {faker.name().firstName(),faker.phoneNumber().cellPhone()}


        };

    }

    @Test(dataProvider = "usernamesAndPasswords")
    public void test3(String username, int pass){
        System.out.println(username+" "+pass);

    }

    @DataProvider(name = "usernamesAndPasswords" )
    public Object[][] unAndPass(){
        return new Object[][]{
                {faker.name().firstName(),faker.phoneNumber().hashCode()},
                {faker.name().firstName(),faker.phoneNumber().hashCode()},
                {faker.name().firstName(),faker.phoneNumber().hashCode()},
                {faker.name().firstName(),faker.phoneNumber().hashCode()},
                {faker.name().firstName(),faker.phoneNumber().hashCode()},
                {faker.name().firstName(),faker.phoneNumber().hashCode()},
                {faker.name().firstName(),faker.phoneNumber().hashCode()},
                {faker.name().firstName(),faker.phoneNumber().hashCode()},
        };

    }

    @Test(dataProviderClass = com.test2package.DataProvider.class, dataProvider = "Infoooo")
    public void test5(String name, String phone){

        System.out.println(name+" "+phone);

    }




}

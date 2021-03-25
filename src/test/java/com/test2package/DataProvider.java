package com.test2package;

import com.github.javafaker.Faker;

public class DataProvider {
    Faker faker = new Faker();

    @org.testng.annotations.DataProvider(name = "Infoooo")
  public Object[][] data(){

      return new Object[][]{
              {faker.name().firstName(),faker.phoneNumber().cellPhone()},
              {faker.name().firstName(),faker.phoneNumber().cellPhone()},
              {faker.name().firstName(),faker.phoneNumber().cellPhone()},
              {faker.name().firstName(),faker.phoneNumber().cellPhone()},
              {faker.name().firstName(),faker.phoneNumber().cellPhone()},
              {faker.name().firstName(),faker.phoneNumber().cellPhone()},
              {faker.name().firstName(),faker.phoneNumber().cellPhone()},
              {faker.name().firstName(),faker.phoneNumber().cellPhone()},
              {faker.name().firstName(),faker.phoneNumber().cellPhone()},
              {faker.name().firstName(),faker.phoneNumber().cellPhone()},
              {faker.name().firstName(),faker.phoneNumber().cellPhone()},

      };
  }
}

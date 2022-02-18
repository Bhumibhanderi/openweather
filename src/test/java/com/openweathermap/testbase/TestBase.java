package com.openweathermap.testbase;


import com.openweathermap.utils.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by Jay
 */
public class TestBase {
    public static PropertyReader propertyReader;

    private static final String API_KEY = "021c5a73f8d60ac35ef3df3c185c9d82";

    @BeforeClass
    public static void init(){
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");


    }

}

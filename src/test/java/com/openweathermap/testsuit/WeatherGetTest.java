package com.openweathermap.testsuit;

import com.openweathermap.constants.EndPoints;
import com.openweathermap.model.WeatherPojo;
import com.openweathermap.testbase.TestBase;
import com.openweathermap.utils.TestUtils;
import io.restassured.http.ContentType;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.http.HttpStatus;
import org.junit.runner.RunWith;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(SerenityRunner.class)
public class WeatherGetTest extends TestBase {

    static String cityName = "london" + TestUtils.getRandomValue();
    static String cityId = "2172797" + TestUtils.getRandomValue();
    static String cityGeographic_Coordinates = "35, 139" + TestUtils.getRandomValue();
    static String cityZipCode = "94040" + TestUtils.getRandomValue();


@Step("Getting the weather information with cityName : {name}\"")
    public ExtractableResponse<Response> searchByCityName_JSONFormat(String cityName) {

    return (ExtractableResponse<Response>) SerenityRest.rest()
            .given().log().all()
            .when()
            .get(EndPoints.GET_SINGLE_CITY_BY_ID)
            .then()
            .statusCode(200);


    }
}

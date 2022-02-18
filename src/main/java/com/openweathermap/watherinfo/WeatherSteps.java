package com.openweathermap.watherinfo;

import com.openweathermap.constants.EndPoints;
import io.restassured.parsing.Parser;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class WeatherSteps {

    @Step("Getting the information of all the Games")
    public ValidatableResponse getGamesInfo() {

        return SerenityRest.rest()
                .given()
                .headers("apiKey", "021c5a73f8d60ac35ef3df3c185c9d82")
                .log()
                .all()
                .when()
                .get(EndPoints.GET_SINGLE_CITY_BY_ID)
                .then().log().ifValidationFails()
                .parser("text/plain;charset=UTF-8", Parser.JSON);
    }
}
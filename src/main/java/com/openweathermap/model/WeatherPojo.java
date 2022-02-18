package com.openweathermap.model;

public class WeatherPojo {
    private String cityName;
    private String cityId;
    private String cityGeographic_coordinate;
    private String zipCode;


    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityGeographic_coordinate() {
        return cityGeographic_coordinate;
    }

    public void setCityGeographic_coordinate(String cityGeographic_coordinate) {
        this.cityGeographic_coordinate = cityGeographic_coordinate;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
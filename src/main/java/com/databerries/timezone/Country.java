package com.databerries.timezone;

import java.io.Serializable;

public class Country implements Serializable{
    private final String countryCode;
    private final String administrationCode;

    Country(String countryCode, String administrationCode) {
        this.countryCode = countryCode;
        this.administrationCode = administrationCode;
    }

    public String countryCode() {
        return countryCode;
    }

    public String administrationCode() {
        return administrationCode;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryCode='" + countryCode + '\'' +
                ", administrationCode='" + administrationCode + '\'' +
                '}';
    }
}

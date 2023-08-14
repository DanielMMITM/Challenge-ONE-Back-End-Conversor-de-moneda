package org.converter.models;

public class Temperatura {
    private String name;

    private double degrees;

    public Temperatura(String name) {
        this.name = name;
    }

    public Temperatura(String name, double degrees) {
        this.name = name;
        this.degrees = degrees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDegrees() {
        return degrees;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }

    public double doCelsiusToFarenheitConversion(double temperatura){
        return ((temperatura * (9 / 5)) + 32);
    }

    public double doCelsiusToKelvinConversion(double temperatura){
        return temperatura + 273.15;
    }

    public double doFarenheitToCelsiusConversion(double temperatura){
        return ((temperatura - 32) * (5/9));
    }

    public double doKelvinToCelsiusConversion(double temperatura){
        return temperatura - 273.15;
    }

}

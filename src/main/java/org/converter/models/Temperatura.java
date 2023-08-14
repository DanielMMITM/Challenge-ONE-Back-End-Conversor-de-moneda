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

    public double doCelsiusToFarenheitConversion(){
        double op1 = (double)9/5;
        return this.degrees * op1 + 32;
    }

    public double doCelsiusToKelvinConversion(){
        return this.degrees + 273.15;
    }

    public double doFarenheitToCelsiusConversion(){
        double op1 = (double)5/9;
        return ((this.degrees - 32) * op1);
    }

    public double doKelvinToCelsiusConversion(){
        return this.degrees - 273.15;
    }

}

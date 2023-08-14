package org.converter.models;

public class Moneda {
    private String currency;
    private double valor;

    public Moneda(String currency, double valor) {
        this.currency = currency;
        this.valor = valor;
    }

    public Moneda(String currency) {
        this.currency = currency;
    }

    private String getDivisa() {
        return currency;
    }

    protected void setDivisa(String currency) {
        this.currency = currency;
    }

    private double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double doConversion(double cantidad){
        return this.valor * cantidad;
    }
}

package org.example.models;

public class Moneda {
    private String currency;
    private double valor;

    public Moneda(String currency, double valor) {
        this.currency = currency;
        this.valor = valor;
    }

    public String getDivisa() {
        return currency;
    }

    public void setDivisa(String currency) {
        this.currency = currency;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

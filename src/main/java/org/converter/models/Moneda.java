package org.converter.models;

public class Moneda {
    private String currency;
    private double valor;

    public Moneda(String currency, double valor) {
        this.currency = currency;
        this.valor = valor;
    }

    private String getDivisa() {
        return currency;
    }

    private void setDivisa(String currency) {
        this.currency = currency;
    }

    private double getValor() {
        return valor;
    }
    private void setValor(double valor) {
        this.valor = valor;
    }
}

package org.example;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String[] topicOptions = {"Cambio de moneda", "Cambio de temperatura"};
        String topicSelected = (String)JOptionPane.showInputDialog(null, "Que operación deseas realizar?",
                "Conversor", JOptionPane.QUESTION_MESSAGE, null, topicOptions, null);

        String[] currencyOptions = {"Pesos MXN a Dólar", "Pesos MXN a Euros", "Pesos MXN a Libras Esterlinas", "Pesos MXN a Yen Japonés"
                , "Pesos MXN a Won sul-coreano", "Dólar a Pesos MXN", "Euros a Pesos MXN", "Libras Esterlinas a Pesos MXN",
                "Yen Japonés a Pesos MXN", "Won sul-coreano a Pesos MXN"};
        String currencySelected = (String)JOptionPane.showInputDialog(null, "Selecciona la divisa a convertir",
                "Divisas", JOptionPane.QUESTION_MESSAGE, null, currencyOptions, null);

        String cantidad = "0";
        do {
            cantidad = (String)JOptionPane.showInputDialog(null, "Ingresa la cantidad que deseas convertir",
                    "Cantidad", JOptionPane.QUESTION_MESSAGE);
        }
        while (!cantidad.matches("^[0-9]*.[0-9]*$"));

    }
}
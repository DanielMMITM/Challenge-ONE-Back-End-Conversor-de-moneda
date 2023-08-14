package org.converter;
import org.converter.models.Moneda;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String[] topicOptions = {"Cambio de moneda", "Cambio de temperatura"};
        String topicSelected = (String)JOptionPane.showInputDialog(null, "Que operación deseas realizar?",
                "Conversor", JOptionPane.QUESTION_MESSAGE, null, topicOptions, null);
        System.out.println(topicSelected);
        if (topicSelected == topicOptions[0]){
            String[] currencyOptions = {"Pesos MXN a Dólar", "Pesos MXN a Euros", "Pesos MXN a Libras Esterlinas", "Pesos MXN a Yen Japonés"
                    , "Pesos MXN a Won Surcoreano", "Dólar a Pesos MXN", "Euros a Pesos MXN", "Libras Esterlinas a Pesos MXN",
                    "Yen Japonés a Pesos MXN", "Won Sulcoreano a Pesos MXN"};
            String currencySelected = (String)JOptionPane.showInputDialog(null, "Selecciona la divisa a convertir",
                    "Divisas", JOptionPane.QUESTION_MESSAGE, null, currencyOptions, null);
            String cantidad = "0";
            do {
                cantidad = (String)JOptionPane.showInputDialog(null, "Ingresa la cantidad que deseas convertir",
                        "Cantidad", JOptionPane.QUESTION_MESSAGE);
            }
            while (!cantidad.matches("^[0-9]*.[0-9]*$"));
            switch(currencySelected){
                case "Pesos MXN a Dólar":
                    Moneda Dolar = new Moneda("Dolar",0.059);
                    double dolares =  Dolar.doConversion(Double.parseDouble(cantidad));
                    JOptionPane.showMessageDialog(null, Double.parseDouble(cantidad) +
                            " pesos equivale a " + dolares + " dolares");
                    break;
                case "Pesos MXN a Euros":
                    Moneda Euro = new Moneda("Euro",0.054);
                    double euros =  Euro.doConversion(Double.parseDouble(cantidad));
                    JOptionPane.showMessageDialog(null, Double.parseDouble(cantidad) +
                            " pesos equivale a " + euros + " euros");
                    break;
                case "Pesos MXN a Libras Esterlinas":
                    Moneda libraEsterlina = new Moneda("Libra Esterlina",0.046);
                    double librasEsterlinas =  libraEsterlina.doConversion(Double.parseDouble(cantidad));
                    JOptionPane.showMessageDialog(null, Double.parseDouble(cantidad) +
                            " pesos equivale a " + librasEsterlinas + " libras esterlinas");
                    break;
                case "Pesos MXN a Yen Japonés":
                    Moneda yenJapones = new Moneda("Yen Japonés",8.51);
                    double yensJaponeses =  yenJapones.doConversion(Double.parseDouble(cantidad));
                    JOptionPane.showMessageDialog(null, Double.parseDouble(cantidad) +
                            " pesos equivale a " + yensJaponeses + " yens japoneses");
                    break;
                case "Pesos MXN a Won Surcoreano":
                    Moneda wonSurcoreano = new Moneda("Won Surcoreano",78.28);
                    double wonsSurcoreanos =  wonSurcoreano.doConversion(Double.parseDouble(cantidad));
                    JOptionPane.showMessageDialog(null, Double.parseDouble(cantidad) +
                            " pesos equivale a " + wonsSurcoreanos + " wons surcoreanos");
                    break;
                case "Dólar a Pesos MXN":
                    break;
                case "Euros a Pesos MXN":
                    break;
                case "Libras Esterlinas a Pesos MXN":
                    break;
                case "Yen Japonés a Pesos MXN":
                    break;
                case "Won Surcoreano a Pesos MXN":
                    break;

            }
        }
        else{

        }
    }
}
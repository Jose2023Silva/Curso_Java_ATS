package org.jasilva.Condicionales;

public class Ejercicio8 {
    public static void main(String[] args) {
        /**
         * Ejercicio 8
         * Pedir un numero entre 0 y 99 999 y decir cuantas cifras tiene
         */
        int numero = Integer.parseInt(
                MensajeGrafico.inputDataGraph("Ingrese un numero a evaluar")
        );

        if (numero < 10) {
            MensajeGrafico.outputDataGraph(" tiene 1 cifra");
        }else if (numero < 100) {
            MensajeGrafico.outputDataGraph(" tiene 2 cifras");
        }else if (numero < 1000) {
            MensajeGrafico.outputDataGraph(" tiene 3 cifras");
        } else if (numero < 10000) {
            MensajeGrafico.outputDataGraph(" tiene 4 cifras");
        } else if (numero < 100000) {
            MensajeGrafico.outputDataGraph(" tiene 5 cifras");
        }
    }
}

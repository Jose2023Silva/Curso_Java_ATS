package org.jasilva.Condicionales;

public class Ejercicio6 {
    public static void main(String[] args) {
        /**
         * Ejercicio 6
         * Hacer un programa que tome dos numeros y diga si ambos son pares o impares
         */
        int numero1 = Integer.parseInt(
                MensajeGrafico.inputDataGraph("Ingresa un primer numero")
        );
        int numero2 = Integer.parseInt(
                MensajeGrafico.inputDataGraph("Ingresa un segundo numero")
        );

        if (numero1%2 == 0 && numero2%2 == 0) {
            MensajeGrafico.outputDataGraph("Ambos son pares");
        }
        else if( numero1%2 != 0 && numero2%2 != 0){
            MensajeGrafico.outputDataGraph("Ambos son inpares");
        } else
            MensajeGrafico.outputDataGraph("Uno es par y otro es inpar");
    }
}

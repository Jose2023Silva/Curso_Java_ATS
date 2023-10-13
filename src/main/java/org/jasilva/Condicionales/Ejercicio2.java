package org.jasilva.Condicionales;

public class Ejercicio2 {
    public static void main(String[] args) {
        /**
         * Ejercicio 2
         * Pedir dos numeros y decir cual es el mayor o si son iguales
         */
        int numA = Integer.parseInt(
                MensajeGrafico.inputDataGraph("Ingresa un primer numero")
        );
        int numB = Integer.parseInt(
                MensajeGrafico.inputDataGraph("Ingresa un segundo numero")
        );

        if (!(numA == numB)) {
            if(numA > numB)
                MensajeGrafico.outputDataGraph(numA + " es mayor que " + numB);
            else
                MensajeGrafico.outputDataGraph(numB + " es mayor que " + numA);
        }else
            MensajeGrafico.outputDataGraph("Ambos numeros son iguales");

    }
}

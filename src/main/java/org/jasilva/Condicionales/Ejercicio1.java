package org.jasilva.Condicionales;

public class Ejercicio1 {
    public static void main(String[] args) {
        /**
         * Hacer un programa que lea un numero entero y muestre si el numero
         * es multiplo de 10
         */
        int numeroIngresado = Integer.parseInt(
                MensajeGrafico.inputDataGraph("Ingrese un numero")
        );
        String mensajeCalc = (numeroIngresado % 10 == 0) ? "el numero " + numeroIngresado + " es multiplo de 10"
                : numeroIngresado + " no es multiplo de 10";
        MensajeGrafico.outputDataGraph(mensajeCalc);
    }
}

package org.jasilva.Operadores;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        /**
         * Ejercicio 8
         * Construir  un programa que calcule y muestre por pantalla las raices
         * de la ecuacion del segundo grado de coeficiente reales
         *
         */
        Scanner inp = new Scanner(System.in);
        double valorA, valorB, valorC, result_x1, result_x2;
        System.out.print("Ingrese el valor a: ");
        valorA = inp.nextDouble();
        System.out.print("Ingrese el valor b: ");
        valorB = inp.nextDouble();
        System.out.print("Ingrese el valor c: ");
        valorC = inp.nextDouble();

        result_x1 = ((valorB * -1)
                + Math.sqrt(
                        (Math.pow(valorB, 2)
                        - (4 * valorA * valorC))
                )) / (2 * valorA);

        result_x2 = ((valorB * -1)
                - Math.sqrt(
                (Math.pow(valorB, 2)
                        - (4 * valorA * valorC))
        )) / (2 * valorA);
        System.out.println("result_x1 = " + result_x1);
        System.out.println("result_x2 = " + result_x2);
    }
}

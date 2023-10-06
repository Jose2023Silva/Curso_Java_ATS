package org.jasilva.Operadores;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        /**
         * Ejercicio 6
         * hacer el programa que calcule el cuadrado de la suma
         *
         */
        Scanner input = new Scanner(System.in);

        double valor_a, valor_b, valor_suma;
        System.out.print("Ingresa el valor a: ");
        valor_a = input.nextDouble();
        System.out.print("Ingresa el valor b: ");
        valor_b = input.nextDouble();

        valor_suma = Math.pow(valor_a, 2)
                + Math.pow(valor_b, 2)
                + (2 * valor_a * valor_b);
        System.out.println("valor_suma = " + valor_suma);
    }
}

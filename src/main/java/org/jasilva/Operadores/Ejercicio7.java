package org.jasilva.Operadores;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        /**
         * Construir un programa que, dado numero total de horas, devuelve
         * el numero de semanas, dias y horas equivalentes.
         *
         */
        int cant_total, semanas, dias, horas;
        Scanner inp = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de horas: ");
        cant_total = inp.nextInt();

        semanas = cant_total / 168;
        System.out.println("semanas = " + semanas);
        dias = (cant_total % 168) / 24;
        System.out.println("dias = " + dias);
        horas = cant_total % 24;
        System.out.println("horas = " + horas);
    }
}

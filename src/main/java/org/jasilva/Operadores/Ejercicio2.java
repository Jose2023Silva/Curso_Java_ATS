package org.jasilva.Operadores;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /**
         * Ejercicio 2
         * @author JoseSilva
         * @date 2023
         * Hacer un programa que calcule e imprima el salario semanal de un empleado a partir
         * de sus horas semanales trabajadas y salario por hora
         */

        byte cant_horas_trabajadas;
        double salario_horas, salario_total;

        Scanner entradas = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        cant_horas_trabajadas = entradas.nextByte();
        System.out.print("Ingrese el salario por hora: ");
        salario_horas = entradas.nextDouble();

        salario_total = salario_horas * cant_horas_trabajadas;
        System.out.println("salario_total = " + salario_total);
    }
}

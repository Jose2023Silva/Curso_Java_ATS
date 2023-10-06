package org.jasilva.Operadores;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /**
         * Ejercicio 4
         * Una empresa de venta de carros usados, paga a su personal de ventas
         * un salario de $1000 mensuales, mas una comision de $150 por cada
         * carro vendido, mas el %5 del valor de la venta por carro.
         * Cada mes el capturista de la empresa ingresa en la computadora los datos
         * pertinentes.
         * Hacer un programa que calcule e imprima el salario mensual de un vendedor
         * dado.
         */
        Scanner inp = new Scanner (System.in);
        final short salario_base = 1000, cant_carros_vendidos;
        double salario_total, precio_carros;

        System.out.print("Ingrese la cantidad de carros vendidos: ");
        cant_carros_vendidos = inp.nextShort();
        System.out.print("Ingrese el precio de los carros: $");
        precio_carros = inp.nextDouble();

        salario_total = salario_base
                + (150 * cant_carros_vendidos)
                + (0.05 * cant_carros_vendidos * precio_carros);
        System.out.printf("Salario total: $%.2f USD", salario_total);
    }
}

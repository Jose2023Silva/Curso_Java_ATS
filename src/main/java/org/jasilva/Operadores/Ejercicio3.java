package org.jasilva.Operadores;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /**
         *  Ejercicio 3
         *  Guillermo tiene N dolars, luis tiene la mitad de lo que posee Guillermo.
         *  Juan tiene la mitad de lo que poseen luis y Guillermo juntos.
         *  Hacer el programa que calcule e imprima la cantidad de dinero que tienen entre los
         *  tres.
         *  
         */
        Scanner input = new Scanner(System.in);
        float guillermo, luis, juan, total;
        System.out.print("Ingresa la cantidad que tiene Guillermo \n> ");
        guillermo = input.nextFloat();
        luis = guillermo / 2;
        juan = (guillermo + luis) / 2;
        total = guillermo + luis + juan;
        System.out.println("total = " + total);
    }
}

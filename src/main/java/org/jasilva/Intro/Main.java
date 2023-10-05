package org.jasilva.Intro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int noIngresado = input.nextInt();
        System.out.print("Ingrese un numero decimal sencillo: ");
        float noDecimal = input.nextFloat();
        input.nextLine(); // se consume el caracter \n que se guarda en el bufer
        System.out.print("Ingrese su nombre: ");
        String nombreIngresado = input.nextLine();
    }
}
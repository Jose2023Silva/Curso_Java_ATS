package org.jasilva.Operadores;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /**
         * Ejercicio 1
         * Hacer un programa que calcule e imprima la suma de tres array_Calificacion
         * usando la clase Scanner para la entrada de datos.
         *
         */
        final byte cantidad_calificacion = 4;
        float array_Calificacion[] = new float[cantidad_calificacion];
        float sumCalf = 0;
        Scanner intput = new Scanner(System.in);

        for (byte posicionCalif = 0;
             posicionCalif < array_Calificacion.length;
             posicionCalif++) {
            System.out.printf("Ingrese la calificacion %d: ", (posicionCalif + 1));
            array_Calificacion[posicionCalif] = intput.nextFloat();
            sumCalf += array_Calificacion[posicionCalif];
        }

        sumCalf /= cantidad_calificacion; // sacando el promedio de la suma
        System.out.println("Promedio = " + sumCalf);
    }
}

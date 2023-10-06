package org.jasilva.Operadores;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        /**
         * Ejercicio 5
         * La calificacion final de un estudiante de informatica se calcula con
         * base a las calidicaciones de cuatro aspectos de su rendimiento academico:
         * Participacion
         * Primer Examen parcial
         * Segundo Examen parcial
         * Examen final
         * Sabiendo que las calidicaciones anteriores entran a la calidicacion final con
         * ponderadores del 10%. 25%, 25% y 40%.
         * Hacer un programa que calcule e imprima la calidicacion final obtenida por un estudiante.
         *
         */
        Scanner input = new Scanner(System.in);

        float[] array_calif = new float[4];
        float calf_final;
        for (int i = 0; i < array_calif.length; i++) {
            System.out.printf("Ingrese la calificacion %d: ", ( i + 1 ) );
            array_calif[i] = input.nextFloat();
        }
        calf_final = (array_calif[0] * 0.1f)
                + (array_calif[1] * 0.25f)
                + (array_calif[2] * 0.25f)
                + (array_calif[3] * 0.4f);
        System.out.printf("Calificacion total : %.2f  ", calf_final);
    }
}

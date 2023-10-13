package org.jasilva.Condicionales;

public class Ejercicio5 {
    public static void main(String[] args) {
        /**
         * Ejercicio 5
         * Un obrero necesita calcular su salario semanal, el cual
         * se obtiene de la siguiete manera
         * Si trabaja 40 horas o menos, se le paga $16 la hora.
         * Si trabaja mas de 40 horas se le paga $16 por cada una de las
         *  primeras horas y $20 por cada hora extra.
         */
        byte cantidadHorasTrabajadas = Byte.parseByte(
                MensajeGrafico.inputDataGraph("Ingrese la cantidad de horas trabajadas")
        );
        int cantidadSalario = 0;
        if (cantidadHorasTrabajadas <= 40){
            cantidadSalario = cantidadHorasTrabajadas * 16;
        } else if (cantidadHorasTrabajadas > 40) {
            cantidadSalario = (40 * 16) + ((cantidadHorasTrabajadas - 40) * 20);
        }
        MensajeGrafico.outputDataGraph("Salario total: $" + cantidadSalario);
    }
}

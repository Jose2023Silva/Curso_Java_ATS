package org.jasilva.Condicionales;

public class Ejercicio7 {
    public static void main(String[] args) {
        /**
         * Ejercicio 7
         * Pedir tres numeros y mostrarlos ordenados de mayor a menor
         */
        float[] arrayNumeros = new float[3];
        for (byte i = 0; i < arrayNumeros.length; i++) {
            arrayNumeros[i] = Float.parseFloat(
                    MensajeGrafico.inputDataGraph("Ingrese el numero " + (i + 1) + " a evaluar")
            );
        }
        // ordenar de mayor a menor usando el logaritmo de burbuja
        for (byte i = 0; i < arrayNumeros.length; i++){
            for (byte j = 0; j < arrayNumeros.length -i - 1; j++) {
                if (arrayNumeros[j] < arrayNumeros[j + 1]) {
                    float temp = arrayNumeros[j];
                    arrayNumeros[j] = arrayNumeros[j + 1];
                    arrayNumeros[j + 1] = temp;
                }
            }
        }
        byte temp = 1;
        String mensaje = "";
        // imprimir el array ordenado
        for (float no : arrayNumeros){
            mensaje  += String.format("%d - %.2f \n",temp, no);
            temp++;
        }
        MensajeGrafico.outputDataGraph("Numeros Ordenados : \n" + mensaje);
    }
}

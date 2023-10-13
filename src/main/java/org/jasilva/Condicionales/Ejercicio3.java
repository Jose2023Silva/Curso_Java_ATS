package org.jasilva.Condicionales;

public class Ejercicio3 {
    public static void main(String[] args) {
        char letra =
                MensajeGrafico.inputDataGraph("Ingresa un caracter")
                        .charAt(0);

        if (Character.isUpperCase(letra)){
            MensajeGrafico.outputDataGraph("el caracter " + letra + " es mayuscula");
        }else {
            MensajeGrafico.outputDataGraph("El caracter " + letra + " no es mayuscula");
        }
    }
}

package org.jasilva.Condicionales;

public class OperadorTernario {
    public static void main(String[] args) {
        /**
         * Operador ternario
         *
         */
        int numeroIngresado = Integer.parseInt(
                CondicionalSIEntonces.inputData("Ingresar un numero")
        );
        /*
        String mensaje = (numeroIngresado % 2 == 0) ? "Es par" : "Es impar";
        CondicionalSIEntonces.OutData(mensaje);
        */
        CondicionalSIEntonces.OutData(
                (numeroIngresado % 2 == 0) ? "Es par" : "Es impar"
        );
    }
}

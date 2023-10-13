package org.jasilva.Condicionales;

public class Ejercicio4 {
    public static void main(String[] args) {
        /**
         * Ejercicio 4
         * En una megaplaza se hace un 20% de descuento a los clientes cuya
         * compra supere los $300.
         * Cual es la compra que pagara una persona por su compra.
         */

        double totalNeto = Double.parseDouble(
                MensajeGrafico.inputDataGraph("Ingrese el total de compra")
        );
        double total;
        if (totalNeto > 300){
            total = totalConDescuento(totalNeto);
        } else {
            total = totalNeto;
        }
        MensajeGrafico.outputDataGraph("Total a pagar:  $" + total);
    }
    private static double totalConDescuento(double totalNeto) {
        return totalNeto - (totalNeto * 0.2);
    }
}

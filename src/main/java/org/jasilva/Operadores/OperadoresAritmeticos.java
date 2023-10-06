package org.jasilva.Operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        double base = 2, exponent = 8;
        double result = Math.pow(base,exponent);
        System.out.println("result = " + result);

        long resultRoud = Math.round(45.126);
        System.out.println("resultRoud = " + resultRoud);

        int noRandom = (int) (Math.random() * (400 - 100 + 1) + 100); // random con limite de 100 a 400
        System.out.println("noRandom = " + noRandom);
    }
}

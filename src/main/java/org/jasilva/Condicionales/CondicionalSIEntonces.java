package org.jasilva.Condicionales;

import javax.swing.*;

public class CondicionalSIEntonces {
    public static void main(String[] args) {
        /**
         * Sentencia IF
         * es donde se evalua para el manejo de validaciones
         * exixte tres tipos de condicionales
         * las simples que es una sola sentencia.
         * if-else que son dobles
         * condiciones multiples
         */

        int numero, dato = 5;
        numero = Integer.parseInt(
                inputData("Ingresa un numero")
        );
        // se puede hacer este tipo de if-else cuando hay una sentencia o linea de codigo
        if (numero == dato)
            OutData("El numero es 5");
        else
            OutData("El numero es diferente de 5");
    }

    protected static String inputData(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }
    protected static void OutData(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

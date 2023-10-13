package org.jasilva.Condicionales;

import javax.swing.*;

public class MensajeGrafico {
    /**
     *
     * @param mensaje
     * @return String que contiene el dato ingresado
     */
    protected static String inputDataGraph(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }

    /**
     *
     * @param mensaje tipo String
     * Funcion que muestra un mensaje de JOptionPane para que muestre como ventana
     */
    protected static void outputDataGraph(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

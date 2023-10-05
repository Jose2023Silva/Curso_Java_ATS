package org.jasilva.Intro;

import javax.swing.JOptionPane;
import java.awt.*;

public class IngresoInt {
    public static void main(String[] args) {
        String nombre;
        int noEntero;
        char caracterIngreso;
        double cantidadMoneroElectronico;

        nombre = JOptionPane.showInputDialog("Ingrese tu nombre");
        JOptionPane.showMessageDialog(null, nombre);

        noEntero = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese su edad")
        );
        JOptionPane.showMessageDialog(null, noEntero);
        caracterIngreso = JOptionPane.showInputDialog("Ingrese su Sexo").charAt(0);
        JOptionPane.showMessageDialog(null, caracterIngreso);
        cantidadMoneroElectronico = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese su cantidad de salario")
        );
        JOptionPane.showMessageDialog(null, cantidadMoneroElectronico);
        /*
        Es un apartado donde se hace prueba sobre el uso de JOptionPane
        int number = JOptionPane.showConfirmDialog(null,
                "choose one",
                "choose one",
                JOptionPane.OK_CANCEL_OPTION);
        System.out.println("number = " + number);

        Object[] options = { "Si",
            "CANCELAR",
            "Posponer",
            "Cerrar Programa"
        };
        int decicionTomada = JOptionPane.showOptionDialog(null,
            "Click OK to continue",
                "Important",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
        );
        System.out.println("decicionTomada = " + decicionTomada);

         */
    }
}

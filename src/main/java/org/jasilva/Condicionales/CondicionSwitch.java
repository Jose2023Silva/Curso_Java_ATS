package org.jasilva.Condicionales;

public class CondicionSwitch {
    public static void main(String[] args) {
        int datos = Integer.parseInt(
                CondicionalSIEntonces.inputData("Ingrese un numero entre 1-5")
        );

        // Sentencia switch
        switch (datos) {
            case 1:
                CondicionalSIEntonces.OutData("es 1");
                break;
            case 2:
                CondicionalSIEntonces.OutData("es 2");
                break;
            case 3:
                CondicionalSIEntonces.OutData("es 3");
                break;
            case 4:
                CondicionalSIEntonces.OutData("es 4");
                break;
            case 5:
                CondicionalSIEntonces.OutData("es 5");
                break;
            default:
                CondicionalSIEntonces.OutData("Parametro no valido");
        }
    }
}

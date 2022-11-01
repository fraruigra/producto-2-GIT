package grupofp.Controlador;

import grupofp.vista.*;

public class Controlador {
    public static void main(String[] args) {
        GestionOS vista = new GestionOS();
        boolean salir = false;
        while (!salir) {
            salir = vista.inicio(salir);
        }
    }
}
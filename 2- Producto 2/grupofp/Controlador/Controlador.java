package grupofp.Controlador;

import grupofp.modelo.*;
import grupofp.vista.*;

public class Controlador {
    public static void main(String[] args) {
        Vista vista = new Vista();
        boolean salir=false;
        while(!salir){
            salir=vista.menuInicial(salir);
        }
    }

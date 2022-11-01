package grupofp.modelo;

import java.util.ArrayList;

public class Lista<L> {

    private L dato;
    protected ArrayList<L> lista;

    public L getDato() {
        return dato;
    }

    public ArrayList<L> getLista() {
        return lista;
    }

    public void setLista(ArrayList<L> lista) {
        this.lista = lista;
    }
}
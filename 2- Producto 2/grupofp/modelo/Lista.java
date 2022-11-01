package grupofp.modelo;

import java.util.ArrayList;

public class Lista<L> {

    protected ArrayList<L> lista;

    public Lista() {
        lista = new ArrayList<>();
    }

    public boolean delete(L l) {
        return lista.remove(l);
    }

    public boolean add(Clientes cliente) {
        if (lista.contains(cliente))
            return false;
        lista.add((L) cliente);
        return true;
    }

    public ArrayList<L> getArrayList() {
        ArrayList<L> alist = new ArrayList<>(lista);
        return alist;
    }

}
package grupofp.modelo;

import java.util.ArrayList;

public class ListaPedidos extends Lista<Pedidos> {
    ArrayList<Pedidos> pedidos;

    public ListaPedidos(ArrayList<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Pedidos> getPedidos() {
        return pedidos;
    }

    public ArrayList<Pedidos> getLista() {
        return lista;
    }

    public void setPedidos(ArrayList<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }

    public void setLista(ArrayList<Pedidos> lista) {
        this.pedidos = lista;
    }

    @Override
    public String toString() {
        return "ListaPedidos{" + "pedidos=" + pedidos + '}';
    }
}
package grupofp.modelo;

import java.util.ArrayList;

public class ListaClientes extends Lista<ClientePremium> {
    ArrayList<ClientePremium> clientes;

    public ListaClientes(ArrayList<ClientePremium> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<ClientePremium> getClientes() {
        return clientes;
    }

    @Override
    public ArrayList<ClientePremium> getLista() {
        return lista;
    }

    public void setClientes(ArrayList<ClientePremium> clientes) {
        this.clientes = clientes;
    }

    @Override
    public void setLista(ArrayList<ClientePremium> lista) {
        this.lista = lista;
    }

    public void addCliente(ClientePremium cliente) {
        clientes.add(cliente);
    }

    @Override
    public String toString() {
        return "ListaClientes{" + "clientes=" + clientes + '}';
    }
}
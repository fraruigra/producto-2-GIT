package grupofp.modelo;

import java.util.ArrayList;
import java.util.List;

public class ListaClientes extends Lista<ClientePremium> {
    public List<Clientes> getClientes(String tipoCliente){
        List<Clientes> cl = new ArrayList<>();
        for(Clientes cliente : this.getArrayList()){
            if(cliente.tipoCliente().equals(tipoCliente)){
                if(tipoCliente.equals("ClientePremium")){
                    ClientePremium nuevoCliente = new ClientePremium();
                    cl.add(nuevoCliente);
                }else{
                    ClienteEstandar nuevoCliente = new ClienteEstandar();
                    cl.add(nuevoCliente);
                 }
            }
        } return cl;
    }
    public Clientes getClienteNif(String nif){
        for(Clientes cliente : this.getArrayList()){
            if(cliente.getNif().equals(nif)){
                return cliente;
            }
        }return null;
    }
}
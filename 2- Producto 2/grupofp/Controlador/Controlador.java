package grupofp.Controlador;

import java.time.LocalDateTime;

import grupofp.modelo.*;
//import grupofp.vista.*;

public class Controlador {
    private Datos datos;

    public Controlador() {
        datos = new Datos();
    }

    public Datos getDatos() {
        return datos;
    }

    public void setDatos(Datos datos) {
        this.datos = datos;
    }

    String str;

    // Articulos
    public String articulosLista() {
        // String str;

        if (datos.getArticulos().isEmpty()) {
            str = "No existen artículos.";

        } else {
            for (Articulos articulos : datos.getArticulos()) {
                str += articulos.toString();
            }
        }
        return str;
    }

    public boolean anadirArticulo(String codigo, String descripcion, double precioVenta, double gastoEnvio,
            LocalDateTime tiempoPreparacion) {
        Articulos articulo = new Articulos(codigo, descripcion, precioVenta, gastoEnvio, tiempoPreparacion);
        return datos.anadirArticulo(articulo);
    }

    public Articulos getArticulosCodigo(String codigo) {
        return datos.getArticulosCodigo(codigo);
    }

    public boolean ArticuloExistente(String codigo) {
        return datos.getArticulosCodigo(codigo) != null;
    }

    // Clientes
    public String clientesLista() {
        if (datos.getClientes().isEmpty()) {
            str = "No hay cliente.";
        } else {
            for (Clientes cliente : datos.getClientes()) {
                str += cliente.toString();
            }
        }
        return str;
    }

    public String clientesListaEstandar() {
        if (datos.getClientes("ClienteEstandar").isEmpty()) {
            str = "No hay cliente estandar";
        } else {
            for (Clientes cliente : datos.getClientes("ClienteEstandar")) {
                str += cliente.toString();
            }
        }
        return str;
    }

    public String clientesListaPremium() {
        if (datos.getClientes("ClientePremium").isEmpty()) {
            str = "No hay cliente premium";
        } else {
            for (Clientes cliente : datos.getClientes("ClientePremium")) {
                str += cliente.toString();
            }
        }
        return str;
    }

    public boolean anadirClienteEstandar(String nif, String nombre, String email, String domicilio) {
        Clientes cliente = new ClienteEstandar(nif, nombre, email, domicilio);
        return datos.addCliente(cliente);
    }

    public boolean anadirClientePremium(String nif, String nombre, String email, String domicilio) {
        Clientes cliente = new ClientePremium(nif, nombre, email, domicilio);
        return datos.addCliente(cliente);
    }

    public Clientes getClienteNif(String nif) {
        return datos.getClienteNif(nif);
    }

    public Clientes ClienteExistente(String nif) {
        return datos.getClienteNif(nif);
    }

    // To do PEDIDOS addPedido y eliminarPedido

}
package grupofp.modelo;

public class ClienteEstandar extends Clientes {

    public ClienteEstandar(String nombre, String domicilio, String nif, String email) {
        super(nombre, domicilio, nif, email);
    }

    @Override
    public String tipoCliente() {
        return ("Es cliente estandard");
    }

    @Override
    public float calcAnual() {
        return (0.0f);
    }

    @Override
    public float descuentoEnv() {
        return (0.0f);
    }
}
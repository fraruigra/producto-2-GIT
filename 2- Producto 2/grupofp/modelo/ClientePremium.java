package grupofp.modelo;

public class ClientePremium extends Clientes {

    public ClientePremium(String nombre, String domicilio, String nif, String email) {
        super(nombre, domicilio, nif, email);
    }

    @Override
    public String tipoCliente() {
        return ("Es cliente premium");
    }

    @Override
    public float calcAnual() {
        return (30.0f);
    }

    @Override
    public float descuentoEnv() {
        return (20f);
    }
}
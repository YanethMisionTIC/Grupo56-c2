package Herencia;

public class Cliente extends Persona {

    private int idCliente;
    private boolean clientePreferencial;
    private String direccion;
    private static int contadorClientes;

    public Cliente(boolean clientePreferencial, String direccion, String nombre, String apellido, String tipoDocumento, String documento, String email) {
        super(nombre, apellido, tipoDocumento, documento, email);
        this.clientePreferencial = clientePreferencial;
        this.direccion = direccion;
        this.idCliente = ++Cliente.contadorClientes;
    }

    @Override
    public String toString() {
        return "    {\n         idPersona: " + idPersona
                + ",\n         Cliente N°: " + idCliente
                + ",\n         Nombre: " + nombre + " " + apellido
                + ",\n         Tipo documento: " + tipoDocumento
                + ",\n         N° documento: " + documento
                + ",\n         Preferencial: " + clientePreferencial
                + ",\n         Dirección: " + direccion
                + ",\n         Correo: " + email
                + "\n    }";

    }

}

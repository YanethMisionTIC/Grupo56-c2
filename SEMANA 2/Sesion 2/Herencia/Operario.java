package Herencia;

public class Operario extends Empleado{
    private int idOperario;
    private boolean maquinariaPesada;
    private static int contadorOperarios;

    public Operario(boolean maquinariaPesada, double salario, String cargo, String areaEmpresa, boolean arl, String nombre, String apellido, String tipoDocumento, String documento, String email) {
        super(salario, cargo, areaEmpresa, arl, nombre, apellido, tipoDocumento, documento, email);
        this.maquinariaPesada = maquinariaPesada;
        this.idOperario = ++Operario.contadorOperarios;
    }

    @Override
    public String toString() {
        return "    {\n         Empleado N°: " + idEmpleado
                + ",\n         Operario N°: " + idOperario
                + ",\n         Nombre: " + nombre + " " + apellido
                + ",\n         Tipo documento: " + tipoDocumento
                + ",\n         N° documento: " + documento
                + ",\n         Cargo: " + cargo
                + ",\n         ARL: " + arl
                + ",\n         Salario: " + salario
                + ",\n         Dependencia: " + areaEmpresa
                + ",\n         Manejo de maquinaria pesada: " + maquinariaPesada
                + ",\n         Correo: " + email
                + "\n    }";
    }
    
    
}

package Herencia;

public class Jefe extends Empleado {

    private int idJefe;
    private int canSubordinados;
    private static int contadorJefe;

    public Jefe(int canSubordinados, double salario, String cargo, String areaEmpresa, boolean arl, String nombre, String apellido, String tipoDocumento, String documento, String email) {
        super(salario, cargo, areaEmpresa, arl, nombre, apellido, tipoDocumento, documento, email);
        this.canSubordinados = canSubordinados;
        this.idJefe = ++Jefe.contadorJefe;
    }

    @Override
    public String toString() {
        return "    {\n         Empleado N°: " + idEmpleado
                + ",\n         Jefe N°: " + idJefe
                + ",\n         Nombre: " + nombre + " " + apellido
                + ",\n         Tipo documento: " + tipoDocumento
                + ",\n         N° documento: " + documento
                + ",\n         Cargo: " + cargo
                + ",\n         ARL: " + arl
                + ",\n         Salario: " + salario
                + ",\n         Dependencia: " + areaEmpresa
                + ",\n         Cantidad subordinador: " + canSubordinados
                + ",\n         Correo: " + email
                + "\n    }";
    }

}

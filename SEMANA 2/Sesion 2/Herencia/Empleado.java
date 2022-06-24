package Herencia;

public class Empleado extends Persona{
    //1. Añado los atributos propios de esta clase
    protected int idEmpleado;
    protected double salario;
    protected String cargo;
    protected String areaEmpresa;
    protected boolean arl;
    protected static int contadorEmpleados;
    
    //Añado el constructor de la clase
    public Empleado(double salario, String cargo, String areaEmpresa, boolean arl, String nombre, String apellido, String tipoDocumento, String documento, String email) {
        super(nombre, apellido, tipoDocumento, documento, email);
        this.salario = salario;
        this.cargo = cargo;
        this.areaEmpresa = areaEmpresa;
        this.arl = arl;
        //Generamos el incremento automatico cada que se crea un nuevo empleado
        this.idEmpleado = ++Empleado.contadorEmpleados;
    }
    
    //Imprimir el objeto empleado

    @Override
    public String toString() {
        return "    {\n         idPersona=" + idPersona 
                + ",\n         idEmpleado=" + idEmpleado 
                + ",\n         Nombre: " + nombre + " "+ apellido 
                + ",\n         Tipo documento: " + tipoDocumento 
                + ",\n         N° documento: " + documento 
                + ",\n         Cargo: " + cargo 
                + ",\n         ARL: " + arl 
                + ",\n         Salario: " + salario 
                + ",\n         Dependencia: " + areaEmpresa 
                + ",\n         Correo: " + email 
                + "\n    }";
    }
    
    
    
}

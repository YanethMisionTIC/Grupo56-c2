package Herencia;

public class Domiciliario extends Empleado {

    private int idDomiciliario;
    private String[] tipoTransporte;
    private boolean papelesAlDia;
    private String jornadaDisponibilidad;
    private static int contadorDomiciliarios;

    public Domiciliario(String jornadaDisponibilidad, String[] tipoTransporte, boolean papelesAlDia, double salario, String cargo, String areaEmpresa, boolean arl, String nombre, String apellido, String tipoDocumento, String documento, String email) {
        super(salario, cargo, areaEmpresa, arl, nombre, apellido, tipoDocumento, documento, email);
        this.jornadaDisponibilidad = jornadaDisponibilidad;
        this.tipoTransporte = tipoTransporte;
        this.papelesAlDia = papelesAlDia;
        this.idDomiciliario = ++Domiciliario.contadorDomiciliarios;
    }
    
    public String recorrerArrayTiposTransporte(String[] tiposTransporte){
        System.out.println("Cantidad de elementos del array " + tipoTransporte.length);
        String medioTransporte = "";
        //for que recorre el array desde el primer elemento hasta el último
        for (int i = 0; i < tipoTransporte.length; i++) {
            //Imprimimos el contenido de cada posición del array
            System.out.println(tipoTransporte[i]);
            //Le asignamos a la variable el contenido que encuentra ene sa iteración
            medioTransporte = tipoTransporte[i];
        }
        return medioTransporte;
    }

    @Override
    public String toString() {
        return "    {\n         Empleado N°: " + idEmpleado
                + ",\n         Domiciliario N°: " + idDomiciliario
                + ",\n         Nombre: " + nombre + " " + apellido
                + ",\n         Documento: " + tipoDocumento + " " + documento
                + ",\n         ARL: " + arl
                + ",\n         Salario: " + salario
                + ",\n         Tipo transporte: " + recorrerArrayTiposTransporte(tipoTransporte)
                + ",\n         Papeles al día: " + papelesAlDia
                + ",\n         Disponibilidad: " + jornadaDisponibilidad
                + ",\n         Correo: " + email
                + "\n    }";

    }
}

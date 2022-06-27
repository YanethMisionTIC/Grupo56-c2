package Sobreescritura;

public class Gerente extends Empleado{
    //La sobreescritura necesita de la herencia
    private String departamento;

    public Gerente(String departamento, String nombre, double sueldo) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    //Función traida desde el padre utilizando sobreescritura
    @Override
    public String obtenerDetalles() {
        return "Nombre: " + this.departamento + ", departamento: " + this.nombre +  ", sueldo: " + this.sueldo; 
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    
}

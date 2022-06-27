package Sobreescritura;

public class Operario extends Empleado{
    
    private boolean arl;
    private String departamento;

    public Operario(boolean arl, String departamento, String nombre, double sueldo) {
        super(nombre, sueldo);
        this.arl = arl;
        this.departamento = departamento;
    }

    @Override
    public String obtenerDetalles() {
       return "Nombre: " + this.nombre + ", Sueldo: " + this.sueldo +"Departamento: " + this.departamento + ", ARL: " + this.arl ; 
    }

    public boolean isArl() {
        return arl;
    }

    public void setArl(boolean arl) {
        this.arl = arl;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}

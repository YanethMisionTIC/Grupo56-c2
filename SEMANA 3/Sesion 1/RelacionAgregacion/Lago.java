package RelacionAgregacion;

public class Lago {
    //1. Creamos los atributos de la clase
    private String nombreLago;
    private String ubicacion;
    //2. Creamos la relación de agregación de la clase Pato en Lago
    public Pato[] patos;
    
    // Sobrecarga:
    //3. Creamos el constructor de la clase vacío
    public Lago() {    
    }
    //4. Creamos el constructor con todos los atributos

    public Lago(String nombreLago, String ubicacion, Pato[] patos) {
        this.nombreLago = nombreLago;
        this.ubicacion = ubicacion;
        this.patos = patos;
    }   
    //5. Creamos la función toString()
    @Override
    public String toString() {
        for (int i = 0; i < patos.length; i++) {
            System.out.println("Pato "+patos[i].idPato);
        }
        return "Lago{" + "nombreLago: " + nombreLago + ", ubicacion: " + ubicacion + ", cantidad de patos: "+patos.length + '}';
    }
}

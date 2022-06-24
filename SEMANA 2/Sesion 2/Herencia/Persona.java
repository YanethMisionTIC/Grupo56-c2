package Herencia;


public class Persona {
    protected int idPersona; // Valor único
    protected String nombre;
    protected String apellido;
    protected String tipoDocumento;
    protected String documento; // Valor único
    protected String email; //Valor único
    protected static int contadorPersonas;

    //Inserto el constructor: Clic secundario > Insert code > Constructor
    //Se seleccionan todos los campos exceptuando el idPersona
    public Persona(String nombre, String apellido, String tipoDocumento, String documento, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.email = email;
        //Inicializo el contador de personas
        //Cada vez que se crea una instancia de la clase Persona, se incrementa en 1 el contador
        this.idPersona = ++Persona.contadorPersonas;
    }  
}

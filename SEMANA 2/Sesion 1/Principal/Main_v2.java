package Principal;
import Herencia.*;

public class Main {
    
    public static void main(String[] args) {
        /*
        =============================================================================
        ===================================PersonClass===============================
        =============================================================================
        */
        //Instancia que utiliza el constructor vacío
        //PersonClass instance1 = new PersonClass();
        
        //Instancia que utiliza el constructor con 2 params
        PersonClass instance2 = new PersonClass("Marco", "de la Puerta");
        
        //Instancia que envia TODOS los parametros de la clase persona
        PersonClass instance3 = new PersonClass("Lola", "Mento", "lolamento@gmail.com", "C.C.", "7208473");
        
        //Consultar el nombre de la instancia2
        System.out.println("El nombre de la instancia 2 es: " + instance2.getPersonName());
        
        //Consultar el correo de la instancia3
        System.out.println(instance3.getEmail());
        
        //Modificar el tipo de documento de la instancia3 por C.E.
        instance3.setDocumentType("C.E.");
        //Cosultamos el tipo de documento de la instancia3
        System.out.println(instance3.getDocumentType());
        
        //Imprimir como una estructura objeto la información de la instancia3
        System.out.println("Objeto: \n" + instance3.toString());
        
        //Imprimir como una estructura objeto la información de la instancia1
        //System.out.println("Objeto: \n" + instance1.toString());
        
        /*
        =============================================================================
        ===================================Employee==================================
        =============================================================================
        */
        
        Employee instEmployee = new Employee(3500000, "Ing. de sistemas", true, "Marco", "Tulio", "tulio@gmail.com", "C.C.", "7054462");
        System.out.println(instEmployee.toString());
    }
    
}

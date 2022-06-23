package Principal;

import Herencia.*;

public class Main {

    public static void main(String[] args) {
        /*
        =============================================================================
        ===================================Employee==================================
        =============================================================================
         */

        Employee instEmployee = new Employee(3500000, "Ing. de sistemas", true, "Marco", "Tulio", "tulio@gmail.com", "C.C.", "7054462");
        Employee instEmployee2 = new Employee(2100000, "Contador", false, "Raúl", "Vallesteros", "raul@gmail.com", "C.C.", "8054462");
        System.out.println(instEmployee.toString());
        System.out.println(instEmployee2.toString());
        
        /*
        =============================================================================
        ===================================Client==================================
        =============================================================================
         */
        
        Client instClient = new Client("Avenida 534", "Manizales", "Alejandro", "Mejía", "alejandro@gmail.com", "C.E.", "AT645223");
        System.out.println(instClient.toString());
    }

}

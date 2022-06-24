package Principal;

import Herencia.*;

public class Main {

    public static void main(String[] args) {
        
        /*
        ===========================================================================
        ==================================Cliente==================================
        ===========================================================================
         */
        System.out.println("============================================================================");
        System.out.println("=======================***Clientes***==========================");
        System.out.println("============================================================================");
        Cliente insCliente1 = new Cliente(true, "Manizales", "Marci", "Ana", "C.C.", "75301310", "marciana@gmail.com");
        Cliente insCliente2 = new Cliente(false, "Bucaramanga","Marco", "de la Puerta", "C.C.", "75222222", "marco@gmail.com");
        System.out.println("[\n" + insCliente1.toString() + ",\n" + insCliente2.toString() + "\n]");

        /*
        /*
        ===========================================================================
        ==================================Jefe==================================
        ===========================================================================
         */
        System.out.println("============================================================================");
        System.out.println("=======================***Equipo administrativo***==========================");
        System.out.println("============================================================================");
        Jefe insJefe1 = new Jefe(20, 3500000, "Ing de sistemas", "Sistemas", true, "Marci", "Ana", "C.C.", "75301310", "marciana@gmail.com");
        Jefe insJefe2 = new Jefe(15, 4700000, "Líder sistemas", "Sistemas", true, "Marco", "de la Puerta", "C.C.", "75222222", "marco@gmail.com");
        System.out.println("[\n" + insJefe1.toString() + ",\n" + insJefe2.toString() + "\n]");

        /*
        ===========================================================================
        ==================================Operario==================================
        ===========================================================================
         */
        System.out.println("============================================================================");
        System.out.println("============================***Operarios***================================");
        System.out.println("============================================================================");
        Operario insOperario1 = new Operario(true, 3500000, "Ing de sistemas", "Sistemas", true, "Marci", "Ana", "C.C.", "75301310", "marciana@gmail.com");
        Operario insOperario2 = new Operario(false, 4700000, "Líder sistemas", "Sistemas", true, "Marco", "de la Puerta", "C.C.", "75222222", "marco@gmail.com");
        System.out.println("[\n" + insOperario1.toString() + ",\n" + insOperario2.toString() + "\n]");

        /*
        ===========================================================================
        ==================================Domiciliario==================================
        ===========================================================================
         */
        System.out.println("============================================================================");
        System.out.println("============================***Domiciliario***================================");
        System.out.println("============================================================================");
        String[] mediosTrasnporte1 = {"Moto", "Vehiculo particular"};
        String[] mediosTrasnporte2 = {"Moto", "Vehiculo particular", "Bicileta"};
        Domiciliario insDomiciliario1 = new Domiciliario("a.m.", mediosTrasnporte1, true, 1200000, "Ing de sistemas", "Sistemas", true, "Marci", "Ana", "C.C.", "75301310", "marciana@gmail.com");
        Domiciliario insDomiciliario2 = new Domiciliario("p.m.", mediosTrasnporte2, false, 1200000, "Líder sistemas", "Sistemas", true, "Marco", "de la Puerta", "C.C.", "75222222", "marco@gmail.com");
        System.out.println("[\n" + insDomiciliario1.toString() + ",\n" + insDomiciliario2.toString() + "\n]");

    }

}

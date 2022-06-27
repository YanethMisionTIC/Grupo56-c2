package Principal;

import ClasesAbstractas.*;
import RelacionAgregacion.Lago;
import RelacionAgregacion.Pato;
import RelacionComposicion.Panal;
import Sobreescritura.*;
import Vistas.Index;

public class Main {

    public static void main(String[] args) {
        //POLIMORFISMO
        //Instancia de empleado se crea igual
        Empleado empleado = new Empleado("Juan", 5000000);
        imprimir(empleado);

        //Empleado sufre una reasignación de valor
        //Tomando como valor una instancia gerente
        empleado = new Gerente("Karla", "Contabilidad", 3000000);
        imprimir(empleado);

        empleado = new Operario(true, "Construcción", "Jacinto", 2400000);
        imprimir(empleado);

        //Ejemplo de abstracción
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();

        //Relación de agregación entre clases
        /*
            1. Creamos la instancia de la clase Lago con el constructor vacío
            2. Mediante la instancia de Lago especificamos el tamaño de la colección
               de patos
            3. Creamos la cantidad de instancias de la clase pato necesarias
            4. Añadimos cada instancia de Pato a la colección de Patos de la clase
            Lago
         */
        Lago lago1 = new Lago();
        lago1.patos = new Pato[3];
        
        Pato pato1 = new Pato();
        Pato pato2 = new Pato();
        Pato pato3 = new Pato();
        
        lago1.patos[0] = pato1;   
        lago1.patos[1] = pato2; 
        lago1.patos[2] = pato3;   
        
        Lago lago2 = new Lago("Lago Negro", "Inframundo", lago1.patos);
        System.out.println(lago2.toString());
        
        /*
        1. Se crea la instancia de la clase Panal
        */
        Panal panal1 = new Panal();
        System.out.println(panal1.toString());
        
        //Creamos una instancia de la vista para que cuando ejecutemos la aplicación
        //sea visible el JFrame Form
        Index vista = new Index();
        vista.setVisible(true);
    }

    //El método recibe como argumento un objeto tipo padre
    public static void imprimir(Empleado empleado) {
        //Crea la variable que mediante la instancia de empleado accede
        // a la función de la clase y devuelve la información del empleado
        String detalles = empleado.obtenerDetalles();
        System.out.println("empleado = " + detalles);
    }

}

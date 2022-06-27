
package RelacionComposicion;
//La clase Abeja depende de la existencia de la clase Panal

public class Panal {
    //1. Creamos la relación con la clase abeja mediante la colección
    public Abeja enjambre[];

    //2. Insertamos constructor vacío
    public Panal() {
        //3. La clase que depende de esta, se inicializa en el constructor
        enjambre = new Abeja[2];
        //En cada posición de la colección enjambre se crea una instancia
        //de la clase Abeja
        enjambre[0] = new Abeja("Barry");
        enjambre[1] = new Abeja("Adam");
    }

    @Override
    public String toString() {
        for (int i = 0; i < enjambre.length; i++) {
            //Iteración 1 muestra el contenido enjambre[0] = "Barry"
            //Iteración 2 muestra el contenido enjambre[1] = "Adam"
            System.out.println(enjambre[i].nombre);
        }
        return "Panal{" + "Cantidad de abejas=" + enjambre.length + '}';
    }
}

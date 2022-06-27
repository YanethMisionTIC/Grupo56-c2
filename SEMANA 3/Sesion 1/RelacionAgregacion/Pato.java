package RelacionAgregacion;

public class Pato {
    public int idPato;
    public static int contadorPatos;

    public Pato() {
        this.idPato = ++Pato.contadorPatos;
    }
}
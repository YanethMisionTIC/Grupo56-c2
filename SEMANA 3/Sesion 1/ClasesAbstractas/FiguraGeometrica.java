package ClasesAbstractas;


public abstract class FiguraGeometrica{

    //1. Definimos los atributos de la clase
    protected String tipoFigura;
    
    //2. Creamos el constructor de la clase, en este caso con visibilidad protegida
    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    /*3. Se define el método abstracto de dibujar
        Son multiples figuras y no se puede generalizar la forma de fibujar en el padre
        Se debe implementar el método en cada tipo de figura geométrica, donde ya se 
        especifica la forma del dibujo
    */
    public abstract void dibujar();

    
    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }

}

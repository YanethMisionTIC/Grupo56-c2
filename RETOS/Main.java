/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1.g56;

/**
 *
 * @author YanethM
 */
public class Main {

    //Atajo para crear el método ejecutor: psvm + TAB
    public static void main(String[] args) {
        //1. Creamos la instancia de cada clase
        Exercise1 instancia_clase1 = new Exercise1();
        Exercise2 instancia_clase2 = new Exercise2();
        Exercise3 instancia_clase3 = new Exercise3();
        Exercise4 instancia_clase4 = new Exercise4();
        Exercise5 instancia_clase5 = new Exercise5();
        //2. Mediante la instancia de la clase accedemos a los métodos
//        instancia_clase1.RequestUserData();
//        instancia_clase2.validateNumberEven();
//        instancia_clase3.validateNumberNegativeEven();
//        instancia_clase4.validateNumberPositiveEven();
        instancia_clase5.CorrectPassword();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1.g56;

import java.util.Scanner;

/**
 *
 * @author YanethM
 */
public class Exercise4 {

    //1. Creamos la instancia de la librería Scanner
    Scanner keyboardData = new Scanner(System.in);
    //2. Declaramos de forma global las variables necesarias para la clase
    private int userNumber = 0;

    //3. Creamos el método que validará si el número es par y negativo
    public void validateNumberPositiveEven() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>> Ciclo que valida si par negativo<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("Ingresa un número: ");
        userNumber = keyboardData.nextInt();

        //Validamos lo contrario a lo que nos solicitan en el programa
        //El while se utiliza para validar que el valor solicitado es diferente a lo que solicitan
        while (userNumber >= 0 || userNumber %2 != 0) {
            //Validamos si el número es impar
            if (userNumber % 2 != 0 && userNumber >= 0) {
                System.out.println("Número no cumple las condición de ser negativo par");
                System.out.println("Ingresa otro número: ");
                userNumber = keyboardData.nextInt();
            }else if(userNumber % 2 != 0 && userNumber < 0){
                System.out.println("Número no cumple la condición de ser par");
                System.out.println("Ingresa otro número: ");
                userNumber = keyboardData.nextInt();
            }else{
                System.out.println("Número no cumple las condición de ser negativo");
                System.out.println("Ingresa otro número: ");
                userNumber = keyboardData.nextInt();
            }
        }
        System.out.println("El número " + userNumber + " es negativo par.");
    }
}

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
public class Exercise2 {
    //1. Creamos una instancia de la librería Scanner
    Scanner keyboardData = new Scanner(System.in);
    //2. Declaramos las variables necesarias de forma global
    private int userNumber = 0;
    
    //3. Creamos el método que validará si el número es o no par
    public void validateNumberEven(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>> Validar si es o no par <<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("Ingresa un número: ");
        userNumber = keyboardData.nextInt();
        //4. Validamos si el número ingresado es par
        if(userNumber % 2 == 0){
            System.out.println("El número " + userNumber + " es par.");
        }else{
            System.out.println("El número " + userNumber + " es impar.");
        }
    }
}

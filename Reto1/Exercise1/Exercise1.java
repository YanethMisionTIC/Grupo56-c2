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
public class Exercise1 {
    //1. Creación de la instancia de la librería scanner
    Scanner keyboardData = new Scanner(System.in);
    private String user_name = "";
    private int age = 0;
    private int gender = 0;
   
    //2. Creación del método que solicita datos al usuario
    public void RequestUserData(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>> Diligencia la siguiente información <<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("        Nombre: ");
        //Para hacer lectura de cadena de texto por teclado, se utiliza nextLine()
        user_name = keyboardData.nextLine();
        
        System.out.println("        Edad: ");
        //Para hacer lectura de números enteros por teclado, se utiliza nextInt()
        age = keyboardData.nextInt();
        
        System.out.println("        Selecciona el genero:\n         1. Femenino\n         2. Masculino\n         3. Otro");
        gender = keyboardData.nextInt();
        
        //3. Bloque de condicionales para el género y la edad
        //4. Declaramos una variable que almacenara la salida del bloque condicional
        String result = "";
        //Validamos si es o no mayor de edad y dentro de este condicional, validamos el genero
        if(age >= 18){
            if(gender == 1){
                result = "Mujer mayor de edad";
            }else if(gender == 2){
                result = "Hombre mayor de edad";
            }else if(gender == 3){
                result = "Otro género mayor de edad";
            }else{
                result = "Ingreso incorrecto del género, las opciones son 1, 2 ó 3.";
            }
        }else{
            if(gender == 1){
                result = "Mujer menor de edad";
            }else if(gender == 2){
                result = "Hombre menor de edad";
            }else if(gender == 3){
                result = "Otro género menor de edad";
            }else{
                result = "Ingreso incorrecto del género, las opciones son 1, 2 ó 3.";
            }
        }
        System.out.println(result);
    }
}

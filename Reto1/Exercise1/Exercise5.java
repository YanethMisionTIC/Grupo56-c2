/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1.g56;

import java.util.Scanner;

/**
 *
 * @author YanethM Crear un programa que solicita al usuario la contraseña de su
 * wifi, la cual es “ABC123”, sólo tendrá 3 intentos. Al 3 intento incorrecto,
 * el sistema le mostrará un mensaje indicando que ha sido bloqueado.
 */
public class Exercise5 {

    //1. Declaración de variables globales
    Scanner keyboardInputUser = new Scanner(System.in);
    private String userPassword = "";
    private int numberAttempts = 1;

    //2. Creación del método que valida la contraseña y cantidad de intentos
    public void CorrectPassword() {
        //3. Solicitamos al usuario el dato de la contraseña
        System.out.println("Ingresa la contraseña de tu WIFI");
        userPassword = keyboardInputUser.nextLine();

        //4. Validamos si la cantidad de intentos es menor a 4
        while (numberAttempts < 4) {
            //5. Validamos si la contraseña NO ES EQUIVALENTE a ABC123
            if (!(userPassword.equals("ABC123"))) {
                System.out.println("Contraseña incorrecta.\nIntento" + numberAttempts + ": ");
                userPassword = keyboardInputUser.nextLine();
            } else {
                System.out.println("Se ha establecido conexión con su red wifi.");
                break;
            }
            //6. Incrementamos el intento antes de salir del while, evitando un ciclo infito
            numberAttempts += 1;
        }
    }
}

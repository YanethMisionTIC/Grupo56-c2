/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petproject.g56;

/**
 *
 * @author YanethM
 */
public class PetClass {
     //1. Definir los atributos de la clase
    private String petName = "Dante";
    private char petSex = 'M';
    private int age = 3;
    private String healthStatus = "que esta todo ok";
    private String breed = "coocker Spaniel";
    private boolean pedigree = true;
    private String color = "cafe";
    private String height = "tamaño mediana";

    //2. Creamos las funciones GETTER de cada uno de los atributos
    public String getPetName() {
        return petName;
    }

    public char getPetSex() {
        return petSex;
    }

    public int getAge() {
        return age;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isPedigree() {
        return pedigree;
    }

    public String getColor() {
        return color;
    }

    public String getHeight() {
        return height;
    }

    //3. Creamos un método que imprime los valores de los atributos
    public void showPetInformation() {
        //Atajo: sout + TAB
        System.out.println(getPetName() + " es un " + getPetSex() + " de raza " + getBreed() + " y " + getHeight()
                + " de color " + getColor() + ". Tiene " + getAge() + " años y su estado de salud marca "
                + getHealthStatus() + " y " + isPedigree());
    }
    
}

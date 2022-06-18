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
    private String petName;
    private char petSex;
    private int age;
    private String healthStatus;
    private String breed;
    private boolean pedigree;
    private String color;
    private String height;

    //2. Crear el constructor de la clase PetClass
    //this es un apuntador a las variables de esta clase
    //Parametros que llegan desde el Main: _petName, _petSex, _age, _healthStatus, _breed, _pedigree, _color, _height
    public PetClass(String _petName, char _petSex, int _age, String _healthStatus, String _breed, boolean _pedigree, String _color, String _height) {
        this.petName = _petName;
        this.petSex = _petSex;
        this.age = _age;
        this.healthStatus = _healthStatus;
        this.breed = _breed;
        this.pedigree = _pedigree;
        this.color = _color;
        this.height = _height;
    }
    
    
    //3. Creamos las funciones GETTER de cada uno de los atributos
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

    //4. Creamos un método que imprime los valores de los atributos
    public void showPetInformation() {
        //Atajo: sout + TAB
        System.out.println(getPetName() + " es un " + getPetSex() + " de raza " + getBreed() + " y " + getHeight()
                + " de color " + getColor() + ". Tiene " + getAge() + " años y su estado de salud marca "
                + getHealthStatus() + " y " + isPedigree());
    }
    
}

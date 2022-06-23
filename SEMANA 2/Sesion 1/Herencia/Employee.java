package Herencia;

public class Employee extends PersonClass {

    //1. Declaramos atributos de la clase Empleado
    protected int idEmployee;
    protected double salary;
    protected String positionJob;
    protected boolean socialSecurity;
    //Atributo que será static, es decir, sólo existira en el contexto de esta clase
    public static int counterEmployee;

    //2. Añadimos el constructor de la clase
    public Employee(double salary, String positionJob, boolean socialSecurity, String personName, String lastname, String email, String documentType, String document) {
        //super es para hacer referencia a los atributos de la clase padre o superClase
        super(personName, lastname, email, documentType, document);
        //this es para hacer referencia a los atributos propios de esta clase
        //El atributo estático de la clase, se incremente de forma automática cuando se
        //crea una nueva instancia de la clase empleado
        this.idEmployee = ++Employee.counterEmployee;
        this.salary = salary;
        this.positionJob = positionJob;
        this.socialSecurity = socialSecurity;
    }

    //3. Añadimos la función toString() para imprimir la instancia como un objeto
    @Override
    public String toString() {
        return "Empleado \n{\n" + "     Código: " + idEmployee + ",\n     Salario: " + salary
                + ",\n     Puesto de trabajo: " + positionJob + ",\n     ARL: "
                + socialSecurity + ",\n     Nombre: " + personName + " " + lastname
                + ",\n     Correo electrónico: " + email + "\n}";
    }

}

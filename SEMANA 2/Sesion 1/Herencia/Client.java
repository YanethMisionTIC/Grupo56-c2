package Herencia;

public class Client extends PersonClass {

    //1. Definimos los atributos de la clase
    private int idClient;
    private String address;
    private String residenceCity;
    private static int counterClient;

    //2. Insertamos el constructor de la clase
    public Client(String address, String residenceCity, String personName, String lastname, String email, String documentType, String document) {
        super(personName, lastname, email, documentType, document);
        this.address = address;
        this.residenceCity = residenceCity;
        //3. Inicializamos el contador de clientes
        this.idClient = ++Client.counterClient;
    }

    //3. Insertamos la función toString para retornar como un objeto la instancia creada
    @Override
    public String toString() {
        return "Cliente\n{\n" + "\n        Nombre: " + personName + " " + lastname
                + "\n        IdCliente: " + idClient + ",\n        Dirección: "
                + address + ",\n        Ciudad: " + residenceCity + "\n}";
    }

}

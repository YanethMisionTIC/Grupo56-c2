package Herencia;

public class PersonClass {
    //1. Definir los atributos de la clase
    protected String personName;
    protected String lastname;
    protected String email;
    protected String documentType;
    protected String document;
    
    //2. Crear el constructor vacío de la clase
    // Clic secundario > Insert code > Constructor
    public PersonClass() {}
    
    //3. Crear el constructor de la clase que recibe dos parametros 
    public PersonClass(String personName, String lastname) {
        this.personName = personName;
        this.lastname = lastname;
    }
    
    //4. Crear el constructor de la clase que recibe todos parametros 
    public PersonClass(String personName, String lastname, String email, String documentType, String document) {
        this.personName = personName;
        this.lastname = lastname;
        this.email = email;
        this.documentType = documentType;
        this.document = document;
    }

    //5. Insertamos los GETTER and SETTER
    // Clic secundario > Insert code > GETTER and SETTER
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
    
    
}

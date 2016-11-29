package pgl.ejercicios.agenda;

        import java.io.Serializable;

public class Persona implements Serializable {

    private int fotoID;
    private String nombre;
    private String apellido;
    private int edad;
    private String DNI;

    public Persona(int fotoID, String nombre, String apellido, int edad, String DNI){
        this.fotoID = fotoID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
    }

    public int getFotoID() { return fotoID; }

    public void setFotoID(int fotoID) { this.fotoID = fotoID; }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}

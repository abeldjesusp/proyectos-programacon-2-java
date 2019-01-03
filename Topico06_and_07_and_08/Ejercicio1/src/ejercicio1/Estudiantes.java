package ejercicio1;

public class Estudiantes {
    private String matricula;
    private String nombre;
    private String apellido;
    private String codigoCarrera;

    public Estudiantes() {}
    
    public Estudiantes(String matricula, String nombre, String apellido, String codigoCarrera) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoCarrera = codigoCarrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "matricula=" + matricula + ", nombre=" + nombre + ", apellido=" + apellido + ", codigoCarrera=" + codigoCarrera + '}';
    }   
}

package ejercicio1;

public class Persona {
    private String nombre;
    private int edad;
    private String genero;
    private String estadoCivil;

    public Persona() {
    }
    
    

    public Persona(String nombre, int edad, String genero, String estadoCivil) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + 
                "\nEdad=" + edad + 
                "\nGenero=" + genero +
                "\nEstado Civil=" + estadoCivil;
    }
    
    
    
        
    
}

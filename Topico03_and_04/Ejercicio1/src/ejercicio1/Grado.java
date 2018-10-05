package ejercicio1;

import java.util.Date;

public class Grado extends Estudiantes{
    private String carrera;
    private int creditos;

    public Grado(
            String carrera, 
            int creditos, 
            int matricula, 
            float indiceAcademico, 
            Date fechaDeIngreso, 
            String nombre, 
            int edad, 
            String genero, 
            String estadoCivil) {
        super(matricula, indiceAcademico, fechaDeIngreso, nombre, edad, genero, estadoCivil);
        this.carrera = carrera;
        this.creditos = creditos;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}

package ejercicio1;

import java.util.Date;

public class PostGrado extends Estudiantes {
    private String especializacion;

    public PostGrado(String especializacion) {
        this.especializacion = especializacion;
    }

    public PostGrado(
            String especializacion, 
            int matricula, 
            float indiceAcademico, 
            Date fechaDeIngreso, 
            String nombre,
            int edad, 
            String genero, 
            String estadoCivil) {
        super(matricula, indiceAcademico, fechaDeIngreso, nombre, edad, genero, estadoCivil);
        this.especializacion = especializacion;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }
}

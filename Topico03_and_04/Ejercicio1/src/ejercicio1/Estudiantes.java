package ejercicio1;

import java.util.Date;

public class Estudiantes extends Persona{
    private int matricula;
    private float indiceAcademico;    
    private Date fechaDeIngreso;
    
    public Estudiantes(){}
    public Estudiantes(
            int matricula, 
            float indiceAcademico, 
            Date fechaDeIngreso, 
            String nombre, 
            int edad, 
            String genero, 
            String estadoCivil) 
    {
        super(nombre, edad, genero, estadoCivil);
        this.matricula = matricula;
        this.indiceAcademico = indiceAcademico;
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public int getMatricula() {
        return matricula;
    }

    public float getIndiceAcademico() {
        return indiceAcademico;
    }

    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setIndiceAcademico(float indiceAcademico) {
        this.indiceAcademico = indiceAcademico;
    }

    public void setFechaDeIngreso(Date fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMatricula=" + matricula + 
                "\nIndice Academico=" + indiceAcademico + 
                "\nFechaDeIngreso=" + fechaDeIngreso;
    }
    
    
}

package ejercicio1;

import java.util.Date;

public class Ejecutivo extends Empleados{
    private String cargo;

    public Ejecutivo(
            String cargo, 
            int codigoEmpleado, 
            float ingresosPorNomina, 
            Date fechaDeIngreso, 
            String departamento, 
            String nombre, 
            int edad, 
            String genero, 
            String estadoCivil) {
        super(codigoEmpleado, ingresosPorNomina, fechaDeIngreso, departamento, nombre, edad, genero, estadoCivil);
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }  
}

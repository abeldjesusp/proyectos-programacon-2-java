package ejercicio1;

import java.util.Date;

public class Empleados extends Persona{
    private int codigoEmpleado;
    private float ingresosPorNomina;
    private Date fechaDeIngreso;
    private String departamento;
    
    public Empleados() {
    }
    public Empleados(
            int codigoEmpleado,
            float ingresosPorNomina, 
            Date fechaDeIngreso, 
            String departamento, 
            String nombre, 
            int edad, 
            String genero, 
            String estadoCivil)
    {     
        super(nombre, edad, genero, estadoCivil);
        this.codigoEmpleado = codigoEmpleado;
        this.ingresosPorNomina = ingresosPorNomina;
        this.fechaDeIngreso = fechaDeIngreso;
        this.departamento = departamento;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public float getIngresosPorNomina() {
        return ingresosPorNomina;
    }

    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public void setIngresosPorNomina(float ingresosPorNomina) {
        this.ingresosPorNomina = ingresosPorNomina;
    }

    public void setFechaDeIngreso(Date fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nCodigo Empleado=" + codigoEmpleado + 
                "\nIngresos Por Nomina=" + ingresosPorNomina + 
                "\nFecha De Ingreso=" + fechaDeIngreso + 
                "\nDepartamento=" + departamento;
    }

    
    
}

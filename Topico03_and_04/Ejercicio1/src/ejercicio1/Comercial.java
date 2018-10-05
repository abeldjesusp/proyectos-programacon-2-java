package ejercicio1;

import java.util.Date;

public class Comercial extends Empleados{
    private String zonaDeVenta;
    private String enlaceClienteEmpresa;

    public Comercial(
            String zonaDeVenta, 
            String enlaceClienteEmpresa, 
            int codigoEmpleado, 
            float ingresosPorNomina, 
            Date fechaDeIngreso, 
            String departamento, 
            String nombre, 
            int edad, 
            String genero, 
            String estadoCivil) {
        super(codigoEmpleado, ingresosPorNomina, fechaDeIngreso, departamento, nombre, edad, genero, estadoCivil);
        this.zonaDeVenta = zonaDeVenta;
        this.enlaceClienteEmpresa = enlaceClienteEmpresa;
    }

    public String getZonaDeVenta() {
        return zonaDeVenta;
    }

    public String getEnlaceClienteEmpresa() {
        return enlaceClienteEmpresa;
    }

    public void setZonaDeVenta(String zonaDeVenta) {
        this.zonaDeVenta = zonaDeVenta;
    }

    public void setEnlaceClienteEmpresa(String enlaceClienteEmpresa) {
        this.enlaceClienteEmpresa = enlaceClienteEmpresa;
    }
}

/*
6.Diseñe una clase para el Tiempo. Debe contener como atributos la hora y los minutos. 
Estos atributos debe estar expresados en formato de hora universal, es decir,
la hora se expresa de 0 a 23.  Debe contener un constructor que inicialice el 
tiempo en un valor por defecto y otro constructor que inicialice el tiempo en
valores sugeridos por el usuario.  Además, debe poseer los tradicionales métodos 
SET y GET.  Finalmente, debe disponer de los siguientes métodos custom:

a)	Un método que permita escribir el tiempo en formato estándar (de 1 a 12), p. ej.: 1:59 p.m.
b)	Un metodo que permita agregar un minuto al tiempo.
c)	Un método toString que permita visualizar todos los atributos de esta clase Tiempo

 */
package temaiandiiejercicio6.tiempo;

/**
 *
 * @author Ezequiel
 */
public class Tiempo {
// VARIABLES  
     double horas=0;
     double minutos=0.00;
// CONSTRUCTOR   
       public Tiempo(){
           this.horas=13;
           this.minutos=30.0;
       } 
        public Tiempo(double p_horas ,double p_minutos ){
           if(p_minutos>59 || p_minutos<0 && (p_horas<=22 && p_horas>=0)){
               throw new IllegalArgumentException("Ha enviado valores erroneos.");
           }
            this.horas=p_horas;
           this.minutos=p_minutos;
        }
// SETTERS and GETTTERS        
        public double getHora(){
        
            return this.horas;
        }
        public double getMinutos(){
            return this.minutos;
        }
        
// METHODS
//--- a)
        public void cambiarFormato(double p_hora, double p_minutos){
            if (p_hora<=12 && p_minutos<60) {
                throw new IllegalArgumentException("Ha introducido valores incorrectos.");
            }else{
                this.horas=p_hora;
                this.minutos=p_minutos;
            }
        }
        
//--- b)
        public void setMinutos(double p_minutos){
            if(p_minutos<0 || p_minutos>59){
                throw new IllegalArgumentException("Ha introducido un valor erroneo.");
            }else{
            this.minutos+=p_minutos;
        }
        }
//--- c)
        public String mostrarValores(){
            String resultado=" ESTA ES LA HORA ESTABLECIDA:\t"
                    + this.horas+":"+this.minutos;
            System.out.println(" ESTA ES LA HORA ESTABLECIDA:\t "+this.horas+":"+ this.minutos);
            return resultado;
        }
}

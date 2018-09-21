package cantidadsegundos;

import java.util.Scanner;

/**
 *
 * @author Abel
 */
public class CantidadSegundos {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int num, segundos, dias, horas, minutos;
       
       System.out.print("Cantidad de segundos que desea convertir : ");
       num = entrada.nextInt();
       
       if(num >= 0){
           dias = num/86400;
           horas = (num - dias*86400)/3600;
           minutos = (num - (dias*86400) - (horas*3600))/60;
           segundos = num - (dias * 86400 + horas * 3600 + minutos * 60);

           System.out.println(dias + "d " + horas + "h " + minutos + "m " + segundos + "s ");
       }else{
           System.out.println("Numero fuera de rango");
       }
       
       
       
    }
    
}

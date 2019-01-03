package cantidadsegundos;

import java.util.Scanner;
public class CantidadSegundos {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int num, segundos, dias, horas, minutos;       
       System.out.print("Convertir segundos ");
       num = scan.nextInt();             
       dias = num/86400;
       horas = (num - dias*86400)/3600;
       minutos = (num - (dias*86400) - (horas*3600))/60;
       segundos = num - (dias * 86400 + horas * 3600 + minutos * 60);
       System.out.println(dias + "d " + horas + "h " + minutos + "m " + segundos + "s ");       
    }    
}

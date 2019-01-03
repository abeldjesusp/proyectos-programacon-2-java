package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {
    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int numerador;
       int denominador;
       int resultado;
       
       try{
           System.out.print("Numerador : ");
           numerador = scan.nextInt();
           System.out.print("Denominador : ");
           denominador = scan.nextInt();
           
           resultado = numerador/denominador;
           System.out.println("Resultado : " + resultado);
       }catch(ArithmeticException e){
           System.out.println("Error: división por cero");
       }
    }
    
}

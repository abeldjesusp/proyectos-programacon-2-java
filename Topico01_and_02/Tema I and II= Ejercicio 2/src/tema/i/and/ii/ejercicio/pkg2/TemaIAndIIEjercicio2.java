/*
1.Escribir un programa que escriba los números del 1 a N, en líneas de 10 números.
Siendo N una variable capturada por teclado.  Después de N el programa 
debe escribir “Fin del programa” en una línea nueva. 
 */
package tema.i.and.ii.ejercicio.pkg2;
import java.util.Scanner;
/**
 *
 * @author Ezequiel
 */
public class TemaIAndIIEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner obj= new Scanner(System.in);
        System.out.println("Ingrese el número de N:");
       int valor=obj.nextInt();
       int cont=0;
       String cadena="";
        for (int i = 0; i < valor; i++) {
            cont+=1;
            cadena+= Integer.toString(i)+",";
            if(cont==10){
                System.out.println(cadena);
                cadena="";
                cont=0;
               
            }
            
        }
         System.out.println("Fin del programa");
    }
    
}

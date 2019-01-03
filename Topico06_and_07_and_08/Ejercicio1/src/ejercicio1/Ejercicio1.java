package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {
    private static Scanner scan = new Scanner(System.in);
    private static Estudiantes estudiante;
    
    public static void main(String[] args) {
       menu();
    }
    
    private static void menu(){
        int opcion;
        boolean salir = false;
        Archivos.crearArchivo();
        
        do{
            System.out.println("==================================");
            System.out.println("    1.Guardar estudiantes");            
            System.out.println("    2.Leer lista de estudiantes");
            System.out.println("    0.Salir");
            System.out.println("==================================");

            opcion = scan.nextInt();
            switch(opcion){
                case 1:
                    String matricula;
                    String nombre;
                    String apellido;
                    String codigoCarrera;

                    System.out.print("Cantidad de estudiantes a guardar: ");
                    int cantidad = scan.nextInt();
                    scan.nextLine();
                    for(int i = 0; i<cantidad; i++){
                        System.out.print("Matricula: ");
                        matricula = scan.nextLine();
                        System.out.print("Nombre: ");
                        nombre = scan.nextLine();
                        System.out.print("Apellido: ");
                        apellido = scan.nextLine();
                        System.out.print("Código carrera: ");
                        codigoCarrera = scan.nextLine();
                        estudiante = new Estudiantes(matricula,nombre,apellido,codigoCarrera);
                        Archivos.guardarEstudiante(estudiante);
                    }
                    break;
                case 2:
                    Archivos.leerEstudiantes();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.print("Opción inválida");                   
            }
        }while(!salir);
    }
    
}

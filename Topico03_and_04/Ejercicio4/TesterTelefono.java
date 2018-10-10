import java.util.Scanner;
public class TesterTelefono {

	public static void main(String[] args) {

		Scanner Leer = new Scanner(System.in);
		System.out.println("=================================================================");
		System.out.println("                           Telefono");
		System.out.println("=================================================================");
		System.out.println("\n Menu");
		System.out.println("\n1. Ingresar numero completo");
		System.out.println("2. Ingresar [Area][Prefijo][Numero]");
		System.out.println("3. Salir");
		System.out.println("=================================================================");
		System.out.print("  Digite la opcion que desea : ");
		int opcion = Leer.nextInt();
		System.out.println("=================================================================");
		Teléfono objTelefono = new Teléfono();
		switch(opcion)
		{
		case 1:
			System.out.print("\n  El numero de telefono completo : ");
			long Numero = Leer.nextInt();
			objTelefono.mostrar(Numero);
			break;
		case 2: 
			System.out.print("\n  El area de telefono : ");
			int Area = Leer.nextInt(); 
			System.out.print("\n  El prefijo de telefono : ");
			int Prefijo = Leer.nextInt();
			System.out.print("\n  El numero de telefono : ");
			int Num = Leer.nextInt();
			objTelefono.mostrar(Area, Prefijo, Num);
			break;
		case 3:
			break;
		default:
			System.out.print("Opcion incorrecta");
		}
	}
}

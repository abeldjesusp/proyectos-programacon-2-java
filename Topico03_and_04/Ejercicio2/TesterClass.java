import java.util.Scanner;
public class TesterClass {

	public static void main(String[] args) {
		
		Scanner Leer = new Scanner(System.in);
		System.out.println("=================================================================");
		System.out.println("                 Tienda de accesorios y mas");
		System.out.println("=================================================================");
		System.out.println("\n\tCalculando precio final de producto");
		System.out.println(" Menu");
		System.out.println("\n1. Articulo con 18% ITBIS");
		System.out.println("2. Articulo con 8% ITBIS");
		System.out.println("3. Articulo exento");
		System.out.println("=================================================================");
		System.out.print("  Digite la opcion que desea : ");
		int opcion = Leer.nextInt();
		System.out.println("=================================================================");
		System.out.println("                   Tomando datos de articulo");
		System.out.println("=================================================================");
		System.out.print("\n  Digite la descripcion del articulo : ");
		String ArtDescripcion = Leer.next();
		System.out.print("  Digite el precio base del articulo : ");
		double ArtPrecioBase = Leer.nextDouble();
		System.out.println("=================================================================");
		double ArtPrecioFinal = 0;
		switch(opcion)
		{
		case 1:
			ARTGRUPO1 objArt1 = new ARTGRUPO1();
			objArt1.setDescripcion(ArtDescripcion);
			objArt1.setPrecioBase(ArtPrecioBase);
			ArtPrecioFinal = objArt1.PrecioFinal();
			ArtDescripcion = objArt1.getDescripcion();
			ArtPrecioBase = objArt1.getPrecioBase();
			break;
		case 2: 
			ARTGRUPO2 objArt2 = new ARTGRUPO2();
			objArt2.setDescripcion(ArtDescripcion);
			objArt2.setPrecioBase(ArtPrecioBase);
			ArtPrecioFinal = objArt2.PrecioFinal();
			ArtDescripcion = objArt2.getDescripcion();
			ArtPrecioBase = objArt2.getPrecioBase();
			break;
		case 3:
			EXENTO objArt3 = new EXENTO();
			objArt3.setDescripcion(ArtDescripcion);
			objArt3.setPrecioBase(ArtPrecioBase);
			ArtPrecioFinal = objArt3.PrecioFinal();
			ArtDescripcion = objArt3.getDescripcion();
			ArtPrecioBase = objArt3.getPrecioBase();
			break;
		default:
			System.out.print("Opcion incorrecta");
		}
		System.out.println("Datos finales\n");
		System.out.println("\tDescripcion : " + ArtDescripcion);
		System.out.println("\tPrecio base : " + ArtPrecioBase);
		System.out.println("   --------------------------------------------------\n\tPrecio final : " + ArtPrecioFinal);
	}

}

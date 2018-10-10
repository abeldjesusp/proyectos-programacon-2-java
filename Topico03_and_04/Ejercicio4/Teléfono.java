
public class Teléfono {

	public void mostrar(long TelefonoCompleto) {
		
		System.out.println("\n\tEl telefono es " + TelefonoCompleto);
	}
	
	public void mostrar(int CodigoArea, int prefijo , int Numero) {
		
		System.out.println("\n\tEl telefono es " + CodigoArea + "-" + prefijo + "-" + Numero);
	}
}

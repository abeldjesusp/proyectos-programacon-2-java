import java.util.Scanner; 
public class TesterClass {

	public static void main(String[] args)
	{
		Scanner LeerNum = new Scanner(System.in);
		Fraccion objFraccionPredt = new Fraccion();
		System.out.println("=========================================================================================");
		System.out.println("                      Bienvenido al sistema de operacion matematica");
		System.out.println("=========================================================================================");
		System.out.println("   Tester Class para Fraccion...");
		System.out.println(" ---------------------------------");
		System.out.println("1-) Probando Constructor predeterminado");
		System.out.println("     Numerador = " + objFraccionPredt.getNumerador());
		System.out.println("     Denominador = " + objFraccionPredt.getDenominador());
		System.out.println("  ----------------------\nLa fraccion a realizar es : " + objFraccionPredt.MostrarFraccion());
		System.out.println("\n       Resultado = " + objFraccionPredt.MostrarDecimal());
		System.out.println("=========================================================================================");
		System.out.println("2-) Probando Constructor con ingreso por usuario");
		System.out.print("     Numerador = ");
		int lv_Numerador = LeerNum.nextInt();
		System.out.print("     Denominador = ");
		int lv_Denominador = LeerNum.nextInt();
		Fraccion objFraccionIngrsd = new Fraccion(lv_Numerador, lv_Denominador);
		System.out.println("  ----------------------\nLa fraccion a realizar es : " + objFraccionIngrsd.MostrarFraccion());
		System.out.println("\n       Resultado = " + objFraccionIngrsd.MostrarDecimal());
		System.out.println("=========================================================================================");
		System.out.println("3-) Editando valores de fraccion anterior");
		System.out.print("     Numerador = ");
		lv_Numerador = LeerNum.nextInt();
		System.out.print("     Denominador = ");
		lv_Denominador = LeerNum.nextInt();
		objFraccionIngrsd.setNumerador(lv_Numerador);
		objFraccionIngrsd.setDenominador(lv_Denominador);
		System.out.println("  ----------------------\nLa fraccion a realizar es : " + objFraccionIngrsd.MostrarFraccion());
		System.out.println("\n       Resultado = " + objFraccionIngrsd.MostrarDecimal());
		System.out.println("=========================================================================================");
		
		
		
		

	}

}

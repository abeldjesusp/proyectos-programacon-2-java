
public class Fraccion {

	private int Numerador;
	private int Denominador;
	
	public Fraccion()
	{
		Numerador = 55;
		Denominador = 10;
	}
	
	public Fraccion(int p_Numerador, int p_Denominador)
	{
		Numerador = p_Numerador;
		Denominador = p_Denominador;
	}
	
	public void setNumerador(int p_Numerador)
	{
		Numerador = p_Numerador;
	}
	
	public void setDenominador(int p_Denominador)
	{
		Denominador = p_Denominador;
	}
	
	public int getNumerador()
	{
		return Numerador;
	}
	
	public int getDenominador()
	{
		return Denominador;
	}
	
	public float MostrarDecimal()
	{
		float Decimal = (float)Numerador/Denominador; 
		return Decimal;
	}
	
	public String MostrarFraccion()
	{
		return Numerador + " / " + Denominador;
	}
}


public class ARTGRUPO2 extends ARTICULO {
	
	private double Tasa_itbis = 0.08;
	
	@Override
	public double PrecioFinal()
	{
		return getPrecioBase() * (1 + Tasa_itbis);
	}
}


public class ARTGRUPO1 extends ARTICULO 
{

	private double Tasa_itbis = 0.18;
	
	@Override
	public double PrecioFinal()
	{
		return getPrecioBase() * (1 + Tasa_itbis);
	}
}

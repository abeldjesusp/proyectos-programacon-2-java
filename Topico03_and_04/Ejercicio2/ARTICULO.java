
public abstract class ARTICULO {

		private String Descripcion;
		private double PrecioBase;
		
		public void setDescripcion(String p_Descripcion)
		{
			Descripcion = p_Descripcion;
		}
		
		public void setPrecioBase(double p_PrecioBase)
		{
			PrecioBase = p_PrecioBase;
		}
		
		public String getDescripcion()
		{
			return Descripcion;
		}
		
		public double getPrecioBase()
		{
			return PrecioBase;
		}
		
		public abstract double PrecioFinal();
}

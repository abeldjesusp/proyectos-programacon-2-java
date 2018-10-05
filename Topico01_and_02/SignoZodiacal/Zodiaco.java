import java.util.Scanner; 
public class Zodiaco {

	public static void main(String[] args) 
	{
		/* **********************************************************************************************
		 * 3.	Realizar un programa que lea por teclado el mes y día de nacimiento de una persona.  
		 *      El programa debe determinar a que signo zodiacal pertenece dicha persona.  
		 * **********************************************************************************************/
		
		Scanner LeerNum = new Scanner(System.in);
		String SignoZodiacal = "";
		boolean HaySigno = true;
		boolean Repetir;
		int Mes = 0;
		int Dia = 0;
		System.out.println("=========================================================================================");
		System.out.println("                      Bienvenido al sistema del signo zodiacal");
		System.out.println("=========================================================================================");
		System.out.println("     1  = Enero        |   2  = Febrero     |    3  = Marzo        |    4  = Abril       ");
		System.out.println("     5  = Mayo         |   6  = Junio       |    7  = Julio        |    8  = Agosto      ");
		System.out.println("     9  = Septiembre   |   10 = Octubre     |    11 = Noviembre    |    12 = Diciembre   ");
		System.out.println("=========================================================================================");
		System.out.print("     Favor seleccione el mes de nacimiento : ");
		Mes = LeerNum.nextInt();
		System.out.println("=========================================================================================");
		System.out.print("     Favor seleccione el dia de nacimiento : ");
		Dia = LeerNum.nextInt();
		System.out.println("=========================================================================================");
		switch(Mes)
		{
			case 1:
				if(Dia >= 20)
					SignoZodiacal = "Acuario";
				else
					SignoZodiacal = "Capricornio";
				break;
			case 2:
				if(Dia >= 20)
					SignoZodiacal = "Piscis";
				else
					SignoZodiacal = "Acuario";
				break;
			case 3:
				if(Dia >= 21)
					SignoZodiacal = "Aries";
				else
					SignoZodiacal = "Piscis";
				break;
			case 4:
				if(Dia >= 20)
					SignoZodiacal = "Tauro";
				else
					SignoZodiacal = "Aries";
				break;
			case 5:
				if(Dia >= 21)
					SignoZodiacal = "Gemenis";
				else
					SignoZodiacal = "Tauro";
				break;
			case 6:
				if(Dia >= 21)
					SignoZodiacal = "Cancer";
				else
					SignoZodiacal = "Gemenis";
				break;
			case 7:
				if(Dia >= 23)
					SignoZodiacal = "Leo";
				else
					SignoZodiacal = "Cancer";
				break;
			case 8:
				if(Dia >= 24)
					SignoZodiacal = "Virgo";
				else
					SignoZodiacal = "Leo";
				break;
			case 9:
				if(Dia >= 23)
					SignoZodiacal = "Libra";
				else
					SignoZodiacal = "Virgo";
				break;
			case 10:
				if(Dia >= 23)
					SignoZodiacal = "Escorpio";
				else
					SignoZodiacal = "Libra";
				break;
			case 11:
				if(Dia >= 22)
					SignoZodiacal = "Sagitario";
				else
					SignoZodiacal = "Escorpio";
				break;
			case 12:
				if(Dia >= 22)
					SignoZodiacal = "Capricornio";
				else
					SignoZodiacal = "Sagitario";
				break;
			default:
				HaySigno = false;
		}
		System.out.print(" Su signo zodiacal es : " + SignoZodiacal );
		System.out.println("\n=========================================================================================");
	}

}

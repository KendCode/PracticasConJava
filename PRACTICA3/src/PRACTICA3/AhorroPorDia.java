package PRACTICA3;
import java.util.Scanner;
public class AhorroPorDia {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int dia = 1;
		double ahorro, a;
		
		ahorro = 0.0;
		a = 0.0;
		
		System.out.print("Ingrese cuanto ahorrara: ");
		a = leer.nextDouble();
		
		while(dia <= 365)
		{
			ahorro = ahorro + Math.pow(a, dia);
			System.out.println("DIA "+dia+" AHORRO "+Math.pow(a, dia));
			dia++;
		}
		System.out.println("El ahorro en un año es: "+ahorro);
	}

}

package PRACTICA3;
import java.util.Scanner;
public class ImparesPares {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int n, p1, impar, p2, par, d;
		
		System.out.print("Ingrese los digitos: ");
		n = leer.nextInt();
		
		p1 = 1; impar = 0; p2 = 1; par = 0;
		
		while(n > 0)
		{
			d = n % 10;
			n /= 10;
			
			if(d % 2 == 0)
			{
				par = (d * p2) + par;
				p2 *= 10;
			}
			else
			{
				impar = (d * p1) + impar;
				p1 *= 10;
			}
		}
		System.out.println("IMPAR - PAR");
		System.out.print("El nuevo número es: "+impar+par);
	}

}

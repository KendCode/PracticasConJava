package PRACTICA3;
import java.util.Scanner;
public class MostrarDivisores {

	public static void main(String[] args) 
	{
		// SERA HASTA DIGITAR EL -1
		Scanner leer = new Scanner (System.in);
		int x, n;
		
		System.out.print("ingrese un número hasta digitar el -1: ");
		n = leer.nextInt();
		
		while(n > -1)
		{
			x = 1;
			while(x <= (n/2))
			{
				if(n % x == 0)
				{
					System.out.println("Sus divisores son: "+x);
				}
				x++;
			}
			System.out.print("ingrese un número hasta digitar el -1: ");
			n = leer.nextInt();
		}

	}

}

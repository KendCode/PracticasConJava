package PRACTICA3;
import java.util.Scanner;
public class JuegoDeCartas {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int n, juan, maria, i, d;
		char c;
		
		System.out.print("Ingrese la cantidad de cartas: ");
		n = leer.nextInt();
		
		juan = 0;
		maria = 0;
		i = 0;
		
		while(i < n)
		{
			System.out.print("Ingrese el la carta: ");
			c = leer.next().charAt(0);
			if(c == 'A' || c=='J' || c=='K')
			{
				maria++;
			}
			else
			{
				if(c == 'Q')
				{
					juan++;
				}
				else
				{
					d = Character.getNumericValue (c);
					if(d % 2 == 0)
					{
						juan++;
					}
					else
					{
						maria++;
					}
				}
			}
		i++;
		}
		
		if(juan > maria)
		{
			System.out.print("GANA JUAN CON: "+juan+" Pts.");
		}
		else
		{
			System.out.print("GANA MARIA CON: "+maria+" Pts.");
		}
	}

}

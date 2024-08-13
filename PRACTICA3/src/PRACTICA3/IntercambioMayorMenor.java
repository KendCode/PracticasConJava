package PRACTICA3;
import java.util.Scanner;
public class IntercambioMayorMenor {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int x, my, mn, mul, r, aux, d;
		
		System.out.print("Ingrese los deigitos: ");
		x = leer.nextInt();
		
		my = 4; mn = 4; mul = 1; r = 0; aux = x;
		
		while(x > 0)
		{
			d = x % 10;
			
			if(d > my)
			{
				my = d;
			}
			if(d < mn )
			{
				mn = d;
			}
			x /= 10;
		}
		while(aux > 0)
		{
			d = aux % 10;
			if(d == my)
			{
				r = r + mn * mul;
			}
			else
			{
				if(d == mn)
				{
					r = r + my * mul;
				}
				else
				{
					r = r + d * mul;
				}
			}
			mul *= 10;
			aux /= 10;
		}
		System.out.print("El nuevo número es: "+r);
	}

}

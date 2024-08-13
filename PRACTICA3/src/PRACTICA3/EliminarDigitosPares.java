package PRACTICA3;
import java.util.Scanner;
public class EliminarDigitosPares {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int n, p, r, d;
		
		System.out.print("Ingrese los digitos: ");
		n = leer.nextInt();
		
		p = 1;
		r = 0;
		
		while(n > 0)
		{
			d = n % 10;
			n /= 10;
			
			if(d % 2 != 0)
			{
				r = (d*p) + r;
				p *= 10;
			}
		}
		System.out.print("El nuevo número es: "+r);
	}

}

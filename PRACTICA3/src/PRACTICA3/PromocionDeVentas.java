package PRACTICA3;
import java.util.Scanner;
public class PromocionDeVentas {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		double d, n, t, tn2, tn1, tn, vt, c, total;
		tn2 = 0.0;
		tn1 = 0.0;
		tn = 0.0;
		
		System.out.print("Ingrese el número de ventas: ");
		vt = leer.nextDouble();
		
		c = 1;
		
		while(c <= vt)
		{
			System.out.print("Ingrese el precio de los articulos: ");
			n = leer.nextDouble();
			
			if(n >= 200)
			{
				d = n * 0.15;
				tn2 = n - d;
				System.out.println("Descuento de 15% es: "+d);
				System.out.println("Total con descuento 15% es: "+tn2);
			}
			else
			{
				if(n < 200 && n > 100)
				{
					d = n * 0.12;
					tn1 = n - d;
					System.out.println("Descuento de 12% es: "+d);
					System.out.println("Total con descuento de 12% es: "+tn1);
				}
				else
				{
					d = n * 0.10;
					tn = n - d;
					System.out.println("Descuento de 10% es: "+d);
					System.out.println("Total con descuento del 10% es: "+tn);
				}
			}
		c++;	
		}
		total = tn2 + tn1 + tn;
		System.out.println("El total es: "+total);
	}

}

package PRACTICA2;
import java.util.Scanner;
public class MayorDeCuatroNum {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int a, b, c, d, mayor, menor;
		mayor = 0;
		menor = 0;
		
		System.out.print("Ingrse el primer número: ");
		a = leer.nextInt();
		System.out.print("Ingrse el segundo número: ");
		b = leer.nextInt();
		System.out.print("Ingrse el tercer número: ");
		c = leer.nextInt();
		System.out.print("Ingrse el cuarto número: ");
		d = leer.nextInt();
		
		//PARA EL NUMERO MAYOR
		if(d>a && d>b && d>c) 
		{
			mayor = d;
		}
		else 
		{
			if(c>a && c>b && c>d)
			{
				mayor = c;
			}
			else
			{
				if(b>a && b>c && b>d)
				{
					mayor = b;
				}
				else
				{
					if(a>b && a>c && a>d)
					{
						mayor = a;
					}
				}
			}
			
		}
		System.out.println("El número mayor es: "+mayor);
		//PARA EL NUMERO MENOR
		if(d<a && d<b && d<c) 
		{
			menor = d;
		}
		else 
		{
			if(c<a && c<b && c<d)
			{
				menor = c;
			}
			else
			{
				if(b<a && b<c && b<d)
				{
					menor = b;
				}
				else
				{
					if(a<b && a<c && a<d)
					{
						menor = a;
					}
				}
			}
			
		}
		System.out.println("El número menor es: "+menor);
	}

}

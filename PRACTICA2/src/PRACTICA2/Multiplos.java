package PRACTICA2;
import java.util.Scanner;
public class Multiplos {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int m, n;
		
		System.out.print("Ingrese un número positivo: ");
		n = leer.nextInt();
		
		if(n >= 0) 
		{
			m = n % 5;
			if(m == 0)
			{
				System.out.print("2");
			}
			else
			{
				m = n % 3;
				if(m == 0)
				{
					System.out.print("1");
				}
				else 
				{
					m = n % 3;
					if(m == 0) 
					{
						System.out.print("0");
					}
					else 
					{
						System.out.print("3");
					}
				}
			}
		}
		else
		{
			System.out.print("Ingrese un número valido");
		}

	}

}

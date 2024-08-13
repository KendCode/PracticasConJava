package PRACTICA4;
import java.util.Scanner;
public class MostrarNumerosConCeros {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int n, a, b, x;
		
		System.out.print("Ingrese el digito: ");
		n = leer.nextInt();
		
		a = 1; b = 0; x = 1;
		
		for(int i = 1; i <= n; i++)
		{
			if(b == x)
			{
				b = 0;
				x++;
				System.out.print(a+", ");
				a++;
			}
			else
			{
				if(b == 0)
				{
					System.out.print(b+", ");
				}
				else
				{
					System.out.print(a+", ");
					a++;
				}
				b++;
			}
		}
	}

}

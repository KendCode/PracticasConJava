package PRACTICA4;
import java.util.Scanner;
public class Generar_1_1_4_2_2_9_3_3_3_16_4_4_4_4_25_ {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int n, b, c;
		double p, a;
		
		System.out.print("Ingrese el digito: ");
		n = leer.nextInt();
		
		a = 1; b = 1; c = 1; 
		for (int i = 1; i <= n; i++)
		{
			if(a == c)
			{
				p = Math.pow(a, 2);
				System.out.print(p+", ");
				a++;
				c = 1;
			}
			else
			{
				System.out.print(b+", ");
				if(c == b)
				{
					b++;
					c++;
				}
				else
				{
					c++;
				}
			}
		}

	}

}

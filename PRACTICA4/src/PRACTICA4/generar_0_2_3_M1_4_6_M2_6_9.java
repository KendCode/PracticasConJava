package PRACTICA4;
import java.util.Scanner;
public class generar_0_2_3_M1_4_6_M2_6_9 {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int n, a, b, c, cont;
		
		System.out.print("Ingrse el digito: ");
		n = leer.nextInt();
		
		a = 0; b = 2; c = 3; cont = 1;
		for (int i = 0; i <= n; i++)
		{
			if(cont == 1)
			{
				System.out.print(a+", ");
				a--;
				cont++;
			}
			else
			{
				if(cont == 2)
				{
					System.out.print(b+", ");
					b += 2;
					cont++;
				}
				else
				{
					System.out.print(c+", ");
					c += 3;
					cont = 1;
				}
			}
		}

	}

}

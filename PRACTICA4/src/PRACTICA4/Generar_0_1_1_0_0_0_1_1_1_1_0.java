package PRACTICA4;
import java.util.Scanner;
public class Generar_0_1_1_0_0_0_1_1_1_1_0 {

	public static void main(String[] args)
	{
		Scanner leer= new Scanner (System.in);
		int n, sw, a, b;
		
		System.out.print("Ingrese el digito para ver los numeros: ");
		n = leer.nextInt();
		
		sw = 0; a = 1; b = 1;
		for(int i = 1; i <= n; i++)
		{
			System.out.print(sw+", ");
			if(b == a)
			{
				if(sw == 0)
				{
					sw = 1;
					a++;
					b = 1;
				}
				else
				{
					sw = 0;
					a++;
					b = 1;
				}
			}
			else 
			{
				b++;
			}
		}

	}

}

package PRACTICA4;
import java.util.Scanner;
public class Generar9_9_8_8_7_7_6_6_5_5_4_ {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int n, x, y;
		
		System.out.print("Ingrese el digito: ");
		n = leer.nextInt();
		
		x = 1; y = 9;
		for(int i=1; i<=n; i++)
		{
			System.out.print(y+", ");
			if(x == 2)
			{
				y--;
				x = 1;
				if(y == 0)
				{
					y = 9;
				}
			}
			else
			{
				x++;
			}
		}

	}

}

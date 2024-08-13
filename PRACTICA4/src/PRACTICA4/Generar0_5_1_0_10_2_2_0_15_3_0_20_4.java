package PRACTICA4;
import java.util.Scanner;
public class Generar0_5_1_0_10_2_2_0_15_3_0_20_4 {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int n, x, y, z;
		
		System.out.print("Ingrese el digito para generar los numeros: ");
		n = leer.nextInt();
		
		x = 5; y = 1; z = 0;
		for(int i=1; i<=n; i++)
		{
			if(z == 0)
			{
				System.out.print(z+", ");
				z++;
			}
			else
			{
				System.out.print(x+", "+y+", ");
				x += 5;
				y++;
				z = 0;
			}
		}

	}

}

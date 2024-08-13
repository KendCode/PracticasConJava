package PRACTICA4;
import java.util.Scanner;
public class Generar_1_1_2_1_2_3_4_1_2_3_4_5 {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int n, x, y;
		
		System.out.print("Ingresar el digito: ");
		n = leer.nextInt();
		
		x = 1; y = 1;
		for(int i = 1; i<= n; i++)
		{
			if(y > x)
			{
				x++;
				y = 1;
			}
			System.out.print(y+", ");
			y++;
		}

	}

}

package PRACTICA4;
import java.util.Scanner;
public class GENERA_1_2_4_7_11_16_22_29 {

	public static void main(String[] args) 
	{
		/* SE VA SUMANDO A Y C Y C ES DONDE SE INCREMENTA UNO POR UNO*/
		Scanner leer = new Scanner (System.in);
		int n, a, c;
		
		System.out.print("Ingrese el número para generar los digitos: ");
		n = leer.nextInt();
		
		a = 1; c = 1;
		
		for(int i = 1; i <= n; i++)
		{
			System.out.print(a+", ");
			a += c;
			c++;
		}

	}

}

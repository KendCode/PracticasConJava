package PRACTICA4;
import java.util.Scanner;
public class GeneraTresVecesElNumero {

	public static void main(String[] args) 
	{
		/* NUMEROS IMPARES Y REPETIR TRES VECES  */
		Scanner leer = new Scanner (System.in);
		int n, a, c, par;
		
		System.out.print("Ingresa los digitos: ");
		n = leer.nextInt();
		
		a = 1; c = 1; par = 0;
		
		for(int i = 1; i <= n; i++)
		{
			System.out.print(a+", ");
			if(c == 3)
			{
				a += 2;
				c = 1;
			}
			else
			{
				c++;
			}
		}

	}

}

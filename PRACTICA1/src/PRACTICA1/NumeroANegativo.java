package PRACTICA1;
import java.util.Scanner;
public class NumeroANegativo {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int x, nn;
		
		System.out.print("Ingrese un número: ");
		x = leer.nextInt();
		
		nn = x * -1;
		
		System.out.print("El nuevo número es: "+nn);

	}

}

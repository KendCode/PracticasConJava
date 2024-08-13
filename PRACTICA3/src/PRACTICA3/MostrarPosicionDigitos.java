package PRACTICA3;
import java.util.Scanner;
public class MostrarPosicionDigitos {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int x, p, t;
		
		System.out.print("Ingrese los digitos para mostrar su posición: ");
		x = leer.nextInt();
		p = 0;
		
		while(x > 0)
		{
			t = x % 10;
			x /= 10;
			p++;
			System.out.println("Digito: "+t);
			System.out.println("Posición: "+p);
		}

	}

}

package PRACTICA3;
import java.util.Scanner;
public class ComposionDigitosPosicion {

	public static void main(String[] args) 
	{
		//Mostrar la posicion actual del nuevo numero
		
		Scanner leer = new Scanner (System.in);
		int n, p, d;
		
		System.out.print("Ingrese los digitos para ver su posición: ");
		n = leer.nextInt();
		
		p = 0;
		
		while(n > 0)
		{
			d = n % 10;
			System.out.println("Digito: "+d+" Posición: "+p);
			n = n / 10;
			p++;
		}

	}

}

package PRACTICA1;
import java.util.Scanner;
public class InversionTresNumeros {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int p1, p2, p3, suma, div;
		double porc; 
		
		System.out.print("Ingrese la primera inversion: ");
		p1 = leer.nextInt();
		System.out.print("Ingrese la segunda inversion: ");
		p2 = leer.nextInt();
		System.out.print("Ingrese la tercera inversion: ");
		p3 = leer.nextInt();
		
		suma = p1 + p2 + p3;
		System.out.println("El total de la inversion es: "+suma);
		porc = p1 * 0.1;
		System.out.println("El primero invierte: "+porc+" %");
		porc = p2 * 0.1;
		System.out.println("El segundo invierte: "+porc+" %");
		porc = p3 * 0.1;
		System.out.println("El tercero invierte: "+porc+" %");
	}

}

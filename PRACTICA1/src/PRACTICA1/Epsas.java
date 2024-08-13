package PRACTICA1;
import java.util.Scanner;
public class Epsas {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int precio;
		double consumo, total;
		
		System.out.print("Ingrese el precio: ");
		precio = leer.nextInt();
		System.out.print("Ingrese cuanto fue el consumo: ");
		consumo = leer.nextDouble();
		
		total = precio * consumo;
		
		System.out.print("El total por pagar es: "+total);

	}

}

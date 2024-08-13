package PRACTICA1;
import java.util.Scanner;
public class CostoLlamada {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int minutos;
		double precio, costo;
		
		System.out.print("Ingrese el precio de las llamadas: ");
		precio = leer.nextDouble();
		System.out.print("Ingrese los cuantos minutos duro la llamada: ");
		minutos = leer.nextInt();
		
		costo = precio * minutos;
		
		System.out.print("El costo de la llamada es: "+costo);

	}

}

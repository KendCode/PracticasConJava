package PRACTICA2;
import java.util.Scanner;
public class Hambuerguesas {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int n, total;
		String tipo, pago;
		total = 0;
		
		System.out.print("Ingrese la cantidad de hamburguesas: ");
		n = leer.nextInt();
		System.out.print("Que tipo de hamburguesa desea: ");
		tipo = leer.next();
		
		switch (tipo) 
		{
			case "sencillas":
				total = n * 20;
				break;
			case "doble":
				total = n * 25;
				break;
			case "triple":
				total = n * 28;
				break;
		}
		System.out.print("Cual sera su metodo de pago: ");
		pago = leer.next();
		
		switch(pago)
		{
			case "efectivo":
				System.out.print("El total es: "+total);
				break;
			case "tarjeta":
				double cargo = total * 0.05;
				double t = cargo + total;
				System.out.print("El total mas el cargo por la tarjeta es: "+t);
				break;
		}

	}

}

package PRACTICA1;
import java.util.Scanner;
public class CheueDeViaje {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int dias, hotel, viaticos, total;
		
		System.out.print("Ingrese los dias de estancia: ");
		dias = leer.nextInt();
		System.out.print("Ingrese los gastos del hotel: ");
		hotel = leer.nextInt();
		System.out.print("Ingrse el precio de los viaticos: ");
		viaticos = leer.nextInt();
		
		total = hotel * dias;
		System.out.println("El total del hotel es: "+total+" Bs.");
		total = viaticos * dias;
		System.out.println("El total por los viaticos es: "+total+" Bs.");
		total = dias * 100; 
		System.out.println("El total por los 100 Bs. diarios es: "+total+" Bs.");
		total = (hotel * dias)+(viaticos*dias)+(dias*100);
		System.out.println("El cheque total es: "+total+" Bs.");

	}

}

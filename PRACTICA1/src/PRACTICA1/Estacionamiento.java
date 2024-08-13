package PRACTICA1;
import java.util.Scanner;
public class Estacionamiento {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int precio, hora, cobro;
		
		System.out.print("Ingrese el precio: ");
		precio = leer.nextInt();
		System.out.print("Ingrse el tiempo de estancia: ");
		hora = leer.nextInt();
		
		cobro = precio * hora;
		
		System.out.print("El cobro es de: "+cobro+" Bs.");

	}

}

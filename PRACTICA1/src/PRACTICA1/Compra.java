package PRACTICA1;
import java.util.Scanner;
public class Compra {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int precio;
		double iva, descuento,total;
		
		
		System.out.print("Ingresar el precio del producto: ");
		precio = leer.nextInt();
		
		descuento = precio * 0.20;
		iva = (precio - descuento)*0.15;
		total = (precio - descuento) + iva;
		
		System.out.println("El  descuento es de: "+descuento);
		System.out.println("El total por pagar es: "+total);
	}

}

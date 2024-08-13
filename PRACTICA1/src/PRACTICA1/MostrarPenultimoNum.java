package PRACTICA1;
import java.util.Scanner;
public class MostrarPenultimoNum {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int n, d;
		
		System.out.print("Ingrese un número mayor a diez: ");
		n = leer.nextInt();
		
		if(n >= 10) 
		{
			d = (n / 10)% 10;
			
			System.out.print("El penultimo número es: "+d);
		}else {
			System.out.print("Ingrse un número valido");
		}

	}

}

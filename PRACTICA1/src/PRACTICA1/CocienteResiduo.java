package PRACTICA1;
import java.util.Scanner;
public class CocienteResiduo {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int a, b, cociente, residuo;
		
		System.out.print("Ingrese el primer número: ");
		a = leer.nextInt();
		System.out.print("Ingrese el segundo número: ");
		b = leer.nextInt();
		
		cociente = a / b;
		residuo = a % b;
		
		System.out.println("Cociente: "+cociente);
		System.out.println("Residuo: "+residuo);

	}

}

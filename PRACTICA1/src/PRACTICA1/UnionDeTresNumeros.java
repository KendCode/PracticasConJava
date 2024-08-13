package PRACTICA1;
import java.util.Scanner;
public class UnionDeTresNumeros {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int a, b, c, r;
		
		System.out.print("Ingrese el primer número: ");
		a = leer.nextInt();
		System.out.print("Ingrese el segundo número: ");
		b = leer.nextInt();
		System.out.print("Ingrese el tercer número: ");
		c = leer.nextInt();
		
		r = (a * 100)+(b * 10)+c;
		System.out.print("El nuevo número es: "+r);

	}

}

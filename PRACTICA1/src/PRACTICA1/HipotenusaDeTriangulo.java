package PRACTICA1;
import java.util.Scanner;
public class HipotenusaDeTriangulo {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		double a, b, h;
		
		System.out.print("Ingrese cuanto vale A: ");
		a = leer.nextDouble();
		
		System.out.print("Ingrse cuanto vale B: ");
		b = leer.nextDouble();
		
		h = Math.sqrt(Math.pow(a,2)+Math.pow(b, 2));
		
		System.out.print("La hipotenusa es:"+h);

	}

}

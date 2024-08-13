package PRACTICA1;
import java.util.Scanner;
public class CalificacionDeExamenes {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		double a, b, c, calificacion, pmd;
		
		System.out.print("Ingrese la primera calificación: ");
		a = leer.nextDouble();
		System.out.print("Ingrese la segunda calificación: ");
		b = leer.nextDouble();
		System.out.print("Ingrese la tercera calificación: ");
		c = leer.nextDouble();
		
		calificacion = a * 0.25;
		System.out.println("La primera calificación es: "+calificacion);
		calificacion = b * 0.25;
		System.out.println("La segunda calificación es: "+calificacion);
		calificacion = c * 0.50;
		System.out.println("La tercera calificación es: "+calificacion);
		
		//promedio final
		pmd = (a*0.25)+(b*0.25)+(c*0.50);
		System.out.println("El promedio final es: "+pmd);
	}

}

package PRACTICA2;
import java.util.Scanner;
public class PromedioNotasModulo {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int promedio, nota1, nota2;
		
		System.out.print("Ingrese su promedio: ");
		promedio = leer.nextInt();
		System.out.print("Ingresse su primera calificación: ");
		nota1 = leer.nextInt();
		System.out.print("Ingrese su segunda calificación: ");
		nota2 = leer.nextInt();
		
		if(nota1 >= 0 && nota2 >= 0)
		{
			int suma = (nota1 + nota2)/3;
			int nota3 = promedio + suma;
			System.out.print("La tercera calificación es: "+nota3);
		}
		else
		{
			System.out.println("Ingrese números validos");
		}

	}

}

package PRACTICA1;
import java.util.Scanner;
public class PersonaIrCiudad {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int distancia, velocidad, tiempo;
		
		System.out.print("Ingrese la distancia que recorrera: ");
		distancia = leer.nextInt();
		System.out.print("Ingrse la velocidad: ");
		velocidad = leer.nextInt();
		
		tiempo = distancia / velocidad;
		
		System.out.print("El tiempo es de: "+tiempo);

	}

}

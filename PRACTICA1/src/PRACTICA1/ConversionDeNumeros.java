package PRACTICA1;
import java.util.Scanner;
public class ConversionDeNumeros {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int metro, centimetro, milimetro;
		double kilometro, pulgada;
		
		System.out.print("Ingrese un número en metros para convertir: ");
		metro = leer.nextInt();
		
		centimetro = metro * 100;
		milimetro = metro * 1000;
		pulgada = metro * 39.37;
		kilometro = metro * 0.001;
		
		System.out.println("Centimetro: "+centimetro);
		System.out.println("Milimetro: "+milimetro);
		System.out.println("Pulgada: "+pulgada);
		System.out.println("Kilometro: "+kilometro);
		

	}

}

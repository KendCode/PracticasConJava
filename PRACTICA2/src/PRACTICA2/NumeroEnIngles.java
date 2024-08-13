package PRACTICA2;
import java.util.Scanner;
public class NumeroEnIngles {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int n;
		
		System.out.print("Ingresar un número del 0 al 10: ");
		n = leer.nextInt();
		
		switch(n)
		{
		case 10:
			System.out.print("Ten");
			break;
		case 9:
			System.out.print("Nine");
			break;
		case 8:
			System.out.print("Eight");
			break;
		case 7:
			System.out.print("Seven");
			break;
		case 6:
			System.out.print("Six");
		case 5:
			System.out.print("Five");
			break;
		case 4:
			System.out.print("For");
			break;
		case 3:
			System.out.print("Three");
			break;
		case 2:
			System.out.print("Two");
			break;
		case 1:
			System.out.print("One");
			break;
		case 0:
			System.out.print("Ziro");
			break;
		}
	}

}

package PRACTICA1;
import java.util.Scanner;
public class TiempoVividoDeUnaPersona {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int años, meses, semanas, dias, horas, minutos;
		
		System.out.print("Ingrese su edad: ");
		años = leer.nextInt();
		
		meses = años * 12;
		semanas = meses * 4;
		dias = semanas * 7;
		horas = dias * 24;
		minutos = horas * 60;
		
		System.out.println("Su tiempo vivido en meses es: "+meses);
		System.out.println("Su tiempo vivido en semanas es: "+semanas);
		System.out.println("Su tiempo vivido en dias es: "+dias);
		System.out.println("Su tiempo vivido en horas es: "+horas);
		System.out.println("Su tiempo vivido en minutos es: "+minutos);

	}

}

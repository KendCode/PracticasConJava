package PRACTICA2;
import java.util.Scanner;
public class LaEmpresaTotal {

	public static void main(String[] args) 
	{
		// INCREMENTAR EL SUELDO DE TRABAJADORES
		Scanner leer = new Scanner (System.in);
		double SueldoFinal, Sueldo, Incremento;
		
		System.out.print("Ingrese su sueldo actual: ");
		Sueldo = leer.nextInt();
		
		if(Sueldo > 10000)
		{
			Incremento = Sueldo * 0.025;
		}
		else
		{
			if(Sueldo >= 5000)
			{
				Incremento = Sueldo * 0.05;
			}
			else
			{
				if(Sueldo >= 1000)
				{
					Incremento = Sueldo * 0.075;
				}
				else
				{
					Incremento = Sueldo * 0.08;
				}
			}
		}
		SueldoFinal = Sueldo + Incremento;
		System.out.print("El sueldo final es: "+SueldoFinal);
	}

}

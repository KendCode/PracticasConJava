package PRACTICA4;
import java.util.Scanner;
public class FibonnaciDeMayorAMenor {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int n, a, b, c;
		
		System.out.print("Ingrese el digito: ");
		n = leer.nextInt();
		
		a = 0; b = 1;
		int[] fibonacci = new int[n];
        
        // Calcular la secuencia de Fibonacci y almacenarla en el arreglo
        for (int i = 0; i < n; i++) {
            fibonacci[i] = a;
            c = a + b;
            a = b;
            b = c;
        }

        // Imprimir la secuencia de Fibonacci de mayor a menor
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(fibonacci[i] + ", ");
        }
		
	}

}

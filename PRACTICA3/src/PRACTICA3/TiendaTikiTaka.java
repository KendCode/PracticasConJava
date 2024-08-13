package PRACTICA3;
import java.util.Scanner;
public class TiendaTikiTaka {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int cmy, cim, cmn, tmy, tim, tmn, n, c, vt;
		
		cmy = 0;
		cim = 0;
		cmn = 0;
		tmy = 0;
		tim = 0;
		tmn = 0;
		
		System.out.print("Ingrese la cantidad de ventas: ");
		n = leer.nextInt();
		
		c = 1;
		
		while(c <= n)
		{
			System.out.print("Ingrse el valor de las ventas: ");
			vt = leer.nextInt();
			if(vt > 1000)
			{
				cmy++;
				tmy = tmy + vt;
			}
			else
			{
				if(vt > 500 && vt <= 1000)
				{
					cim++;
					tim = tim + vt;
				}
				else
				{
					if(vt <= 500 && vt > 0)
					{
						cmn++;
						tmn = tmn + vt;
					}
				}
			}
			c++;
		}
		System.out.println("Numero de ventas menor de 500: "+cmn);
		System.out.println("Total menos de 500: "+tmn);
		System.out.println("Numero de ventas mas de 500 y menor a 1000: "+cim);
		System.out.println("Total mas de 500 y menos de 1000: "+tim);
		System.out.println("Numero de ventas mayores a 1000: "+cmy);
		System.out.println("Total mayores a 1000: "+tmy);
		
		int total = tmy + tim +tmn;
		System.out.println("El total vendido es: "+total+" Bs.");
	}

}

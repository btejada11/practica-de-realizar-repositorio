import java.util.*;

public class Metodo_seleccion {

	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		int [] a=[6];
		int i,j, indicemenor,k;
		for(i=0; i< a.length - 1 ; i++ )
		{
			a[i]=sc.nextInt();
 for(j=i+1; j < a.length ; j++)
			{
				if(a[j] < a[indicemenor])
				{
					indicemenor = j;
				}
			}

			if (i != indicemenor)
			{
				int aux = a[i];
				a[i] = a[indicemenor];
				a[indicemenor] = aux;
			}

			for(k=0; k < a.length ; k++)
			{
				System.out.println("a["+k+"]= " +a[k]);
			}

			System.out.println("Pasada: "(i+1));


		}

		for(k=0; k < a.length ; k++)
			{
				System.out.println("a["+k+"]= " +a[k]);
			}
	}
}
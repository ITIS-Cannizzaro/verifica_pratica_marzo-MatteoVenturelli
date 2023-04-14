import java.util.Scanner;

public class Venturelli
{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
			case 1:
				MinimoDiArray();
				break;
			case 2:
				ParoleMisteriose();
				break;
			case 3:
				StampaPari();
				break;
			case 4:
				ArrayDivisori();
				break;
			case 5:
				StampaZigZag();
				break;
			case 6:
				
			case 7:
				UgualeConsecutivi();
				break;
			default:
				System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		System.out.println("1 - Es n. 1 - Titolo es. Minimo di array");
		System.out.println("2 - Es n. 2 - Titolo es. Parole Misteriose");
		System.out.println("3 - Es n. 3 - Titolo es. StampaPari");
		System.out.println("4 - Es n. 4 - Titolo es. Array Divisori");
		System.out.println("5 - Es n. 5 - Titolo es. StampaZigZag");
		System.out.println("7 - Es n. 7 - Titolo es. Uguali Consecutivi");
	}

	static void MinimoDiArray()
	{
		int[] numeri = new int[10];
		int valMin, indiceMin = 0;

		for(int i=0; i<numeri.length; i++)
		{
			numeri[i]= (int) ((Math.random()*11)-5);
			System.out.println(numeri[i]);			
		}
		valMin = numeri[0];
		for(int i=1; i<numeri.length; i++)
		{
			if(numeri[i]<valMin)
			{
				valMin=numeri[i];
				indiceMin=i;
			}
			
		}

		System.out.println("Valore : " + valMin);
		System.out.println("Indice: " + indiceMin);
	}
	
	static void ParoleMisteriose()
	{
		String[] parole = {"Informatica", "Matematica", "Italiano", "Inglese", "Sistemi"};
		int tentativi = 3;
		String parolaIns;
		System.out.println("Indovina una tra le parole dell'array con tre tentativi");
		while(tentativi>0)
		{
			parolaIns = in.nextLine();
			if(parolaIns.equals(parole[0]) || parolaIns.equals(parole[1]) || parolaIns.equals(parole[2]))
				System.out.println("Corretto!");			

			
			else if(parolaIns.equals(parole[3]) || parolaIns.equals(parole[4]))
				System.out.println("Corretto!");// nel caso in cui la parola è corretta bisogna uscire dal ciclo!	
			
			else
				System.out.println("Tentativi rimasti: " + --tentativi);	
		}
		
		
	}
	
	static void StampaPari()
	{
		int[] numeri = new int[20];
		int[] numeriPari1 = new int[numeri.length];
		int k=0;
		for(int i=0; i<numeri.length; i++)
		{
			numeri[i]= (int) ((Math.random()*100)+1);
			System.out.println(numeri[i]);	
		}
		
		for(int i=0; i<numeri.length; i++)
		{
			if(numeri[i]%2 == 0)
			{
				numeriPari1[k]=numeri[i];
				k++;
			}
		}
		
		int[] numeriPariF = new int[k];
		
		for(int i=0; i<numeriPariF.length; i++)
			numeriPariF[i]=numeriPari1[i];

		for(int i=0; i<numeriPariF.length; i++)
		{
			for(int j=0; j<numeriPariF.length-1; j++)
			{
				if(numeriPariF[j]>numeriPariF[j+1])
				{
					swap(numeriPariF, j, j+1);
				}
			}
		}
		
		
		for(int i=0; i<numeriPariF.length; i++)
			System.out.print(numeriPariF[i] + "; ");	
	}
	
	static void UgualeConsecutivi()
	{
		int[] numeri = new int[20];
		for (int i=0; i<numeri.length; i++)
		{
			numeri[i]= (int) ((Math.random()*7)-3);
			System.out.println(numeri[i]);			
		}
	
		System.out.println();			

		for (int i=0; i<numeri.length-1; i++)
		{
			if(numeri[i] == numeri[i+1])
			{
				System.out.println(numeri[i]);	
				System.out.println(i + "; " + (i+1));	

			}

		}	
	}
	
	static void StampaZigZag()
	{
		int[]numeri=new int[10];
		for(int i=0; i<numeri.length; i++)
		{
			numeri[i]= (int) (Math.random()*11);
			System.out.println(numeri[i]);
		}
		
		System.out.println();

		for(int i=0,j=numeri.length-1; i<numeri.length-5; i++,j--)
		{
			System.out.print(numeri[i] + "; " + numeri[j]);
			System.out.println();
		}
		
	}
	
	static void ArrayDivisori()
	{
		int[] numeri = new int[50];
		int[] numeri2= new int[9];
		int div2 = 0,div3 = 0,div4 = 0,div5 = 0,div6 = 0,div7 = 0,div8 = 0,div9 = 0,div10 = 0;
		for(int i=0; i<numeri.length; i++)
		{
			numeri[i]= (int) ((Math.random()*100)+1);
			System.out.print(numeri[i]+"; ");
		}
		
		for(int i=0; i<numeri.length; i++)
		{
			if(numeri[i]%2==0)
				div2++;
			
			if(numeri[i]%3==0)
				div3++;
			
			if(numeri[i]%4==0)
				div4++;
			
			if(numeri[i]%5==0)
				div5++;
			
			if(numeri[i]%6==0)
				div6++;
			
			if(numeri[i]%7==0)
				div7++;
			
			if(numeri[i]%8==0)
				div8++;
			
			if(numeri[i]%9==0)
				div9++;
			
			if(numeri[i]%10==0)
				div10++;
		}
		System.out.println();
		System.out.println("Divisibili per 2: " + div2);
		System.out.println("Divisibili per 3: " + div3);
		System.out.println("Divisibili per 4: " + div4);
		System.out.println("Divisibili per 5: " + div5);
		System.out.println("Divisibili per 6: " + div6);
		System.out.println("Divisibili per 7: " + div7);
		System.out.println("Divisibili per 8: " + div8);
		System.out.println("Divisibili per 9: " + div9);
		System.out.println("Divisibili per 10: " + div10);
	}// Colucci: in questo caso con le conoscenze che hai potevi sicuramente trovare una soluzione migliore
	
	
	
	
	
	
	static void swap(int[] v, int a, int b)
	{
		int temp;
		temp = v[a];
		v[a] = v[b];
		v[b] = temp;
	}
}
// Colucci: Ottima prova!
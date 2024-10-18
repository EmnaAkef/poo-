package tp3;

public class Entier {
	
	static int valeur=0;	
	public static int factoriel(int n)
	{
		int f;
		f=n-1;
		while(f>1)
		{
			n=n*f;
			f--;
		}
		return n;
	}
	public static void absolu(int n)
	{
		if(n>=0)
		{
			System.out.println("la valeur absolue de "+n+" est "+n);
		}
		else
			System.out.println("la valeur absolue de "+n+" est "+-n);
	}
	public static void comparer(int e1 , int e2)
	{
		if (e1>e2)
			System.out.println(e1+">"+e2);
		else
			System.out.println(e1+"<"+e2);
	}
	public static void premier(int n)
	{
		if (n>1)
		{
			int nb=0;
			int i;
			i=n-1;
			while(i>1 && nb==0)
			{
				if (n%i==0)
				{
					nb+=1;
				}
				i--;
			}
			if (nb==0)
			{
				System.out.println(n+" est premier");
			}
			else 
				System.out.println(n+" n'est pas premier");
		}
		else
			System.out.println(n+" n'est pas premier");
			
	}
	public static void incrementer ()
	{
		valeur +=1 ;
	}
}

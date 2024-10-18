package Tp1ex3;
import java.util.Scanner;
public class MaDate {
	
	private int jour;
	private int mois;
	private int annee;
	public MaDate(int j, int m, int a)
	{
		jour=j;
		mois=m;
		annee=a;
	}
	public MaDate(int annee)
	{
		annee=0;
	}
	int getJour()
	{
		return this.jour;
	}
	int getMois()
	{
		return this.mois;
	}
	int getAnnee()
	{
		return this.annee;
	}
	void setJour(int j)
	{
		this.jour=j;
	}
	void setMois(int m)
	{
		this.mois=m;
	}
	void setAnnee(int a)
	{
		this.annee=a;
	}
	public String toString()
	{
		return jour+"/"+mois+"/"+annee ;
	}
	void ajouterUnJour()
	{
		if(this.jour==31 )
		{
			this.jour=1;
			if (this.mois==12)
			{
				this.mois=1;
				this.annee++;
			}
			else
			{
				this.mois+=1;
			}
		}
		else
		{
			if (this.jour==30 && (this.mois==2 || this.mois==4 || this.mois==6 || this.mois==9 || this.mois==11) )
			{
				this.jour=1;
				this.mois ++;
			}
			else
			{
				this.jour ++;
			}
		}
	}
	void ajouterPlusieursJours(int n)
	{
		int i;
		for(i=0;i<n;i++)
		{
			this.ajouterUnJour();
		}
	}
	void ajouterUnMois()
	{
		if (this.mois==12)
		{
			this.mois=1;
			this.annee++;
		}
		else 
		{
			this.mois ++;
		}
	}
	void ajouterUnAn()
	{
		this.annee ++;
	}
	public static void main(String[] args) {
		MaDate d1 = new MaDate(27,10,2004);
		MaDate d2 = new MaDate(10,10,2010);
		MaDate d3 = new MaDate(2024);
		int jj=d1.getJour();
		int mm=d2.getMois();
		int aa=d3.getAnnee();
		System.out.println(jj);
		System.out.println(mm);
		System.out.println(aa);
		int j1=d1.getJour();
		int m1=d1.getMois();
		int a1=d1.getAnnee();
		int j2=d2.getJour();
		int m2=d2.getMois();
		int a2=d2.getAnnee();
		if (j1==j2 && m1==m2 && a1==a2)
		{
			System.out.println("d1 et d2 sont identiques");
		}
		else 
			System.out.println("d1 et d2 ne sont pas identiques");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Menu:");
        System.out.println("1. Ajout d'un jour");
        System.out.println("2. Ajout de plusieurs jours");
        System.out.println("3. Ajout d'un mois");
        System.out.println("3. Ajout d'une année");
        System.out.println("Entrez votre choix (1-4) : ");
        int choix = scanner.nextInt();
        switch (choix) {
        case 1:
            d1.ajouterUnJour();
            System.out.println(d1);
            break;
        case 2:
        	int nj = scanner.nextInt();
            d1.ajouterPlusieursJours(nj);
            System.out.println(d1);
            break;
        case 3:
            d1.ajouterUnMois();
            System.out.println(d1);
            break;
        case 4:
        	d1.ajouterUnAn();
        	System.out.println(d1);
        default:
            System.out.println("Choix invalide, veuillez entrer un numéro entre 1 et 4.");
    }
        scanner.close(); 
		}
	
}

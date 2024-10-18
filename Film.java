package Ex2;
import java.util.Scanner;
public class Film {
	protected String titre;
	protected String r;
	protected String pays;
	protected int d;
	protected int nbr;
	public static int idF=0;
	protected int id;
	public int getNbr() {
		return nbr;
	}

	public void setNbr(int nbr) {
		this.nbr = nbr;
	}
	public String toString()
	{
		return (this.titre+" de "+this.r+" ("+this.pays+") - "+this.d+"min.");
	}
	public Film(String titre, String r, String pays, int d) {
	
		this.titre = titre;
		this.r = r;
		this.pays = pays;
		this.d = d;
		idF++;
		this.id=idF;
	}
	public float totalVenteBillets()
	{
		Scanner scanner = new Scanner(System.in);
		int ne = scanner.nextInt();
		while (ne>this.nbr)
		{
			System.out.println("Saisir le nombre des étudiant correctement");
			ne = scanner.nextInt();
		}
		return (ne*2+(nbr-ne)*3);
	}
}


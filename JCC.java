package Ex2;

public class JCC {
	private Film [] competition;
	private int annee;
	private final int NBFMAX=30;
	public static int nbF=0;
	public JCC (int taille, int annee)
	{
		if(taille <NBFMAX)
		{
			competition= new Film[taille];
			this.annee=annee;
		}
	}
	public void ajoutFilm(Film f)
	{
		if (nbF>competition.length-1)
		{
			System.out.println("La compétition est au complet");
		}
		else
		{
			competition[nbF]=f;
			nbF++;
		}
	}
	public void listeFilmsJCC()
	{
		for (int i=0;i<nbF;i++)
		{
			System.out.println(competition[i]);
		}
	}
	public float totalVenteBilletsJCC()
	{
		float p=0;
		for (int i=0;i<this.nbF;i++)
		{
			p=p+competition[i].totalVenteBillets();
		}
		return p;
	}
}

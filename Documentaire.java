package Ex2;

public class Documentaire extends Film{
	private String sujet;
	private float tarif=2;
	public Documentaire(String sujet,String titre, String r, String pays, int d)
	{
		super(titre, r, pays, d);
		this.sujet=sujet;
	}
	public String toString()
	{
		return (super.toString()+" : "+this.sujet);
	}
	public float totalVenteBillets()
	{
		
		return super.getNbr()*tarif;
	}
}

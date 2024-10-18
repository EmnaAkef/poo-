package tp3_ex3;

public class Maison {
	private String adresse;
	private String type;
	private int nbchambre;
	float surface;
	public Maison ()
	{
		adresse="";
		type="";
		nbchambre=0;
		surface=0;
	}
	public Maison(String adr, String t, int n)
	{
		this.adresse=adr;
		this.type=t;
		this.nbchambre=n;
	}
	public Maison(String adr, String t, int n, float s)
	{
		this.adresse=adr;
		this.type=t;
		this.nbchambre=n;
		this.surface=s;
	}
	public void setSurface(float s)
	{
		this.surface=s;
	}
	public float calculPrix(float pmc)
	{
		return (this.surface*pmc);
	}
	public float calculPrix()
	{
		return (this.surface*2100);
	}
	public String toChaine()
	{
		return (this.type+" de "+this.surface+"m² "+this.adresse+" avec "+this.nbchambre);
	}
	public static void main(String[] args) {
		Maison m1 = new Maison("Tunis","un duplex",4,210);
		Maison m2 = new Maison("Nabeul","une villa",5);
		System.out.println(m1.toChaine());
		System.out.println(m2.toChaine());
		m2.setSurface(230);
		float p1;
		float p2;
		p1=m1.calculPrix(3000);
		p2=m2.calculPrix();
		System.out.println("le prix de m1 est "+p1);
		System.out.println("le prix de m2 est "+p2);
		
	}
}

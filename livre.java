package ex4;

import ex3.Livre;

public class livre {
	private String titre, auteur;
	private float nbPages;
	private double prix;
	private boolean prixFixe;
	public static final double tva =  0.18 ;
	public livre (String auteur, String titre) 
	{
	this.auteur = auteur;
	this.titre = titre;
	}
	public String getAuteur() 
	{
	return auteur;
	}
	public void setNbPages (float nb) 
	{
		if (nb>20)
		{
			this.nbPages = nb;
		}
		else
		{
			System.out.println("Le nombre indiqué est faible");
		}
	}
	public livre ()
	{
		nbPages=0;
		this.prixFixe=false;
	}
	public livre (String titre , float nbPages)
	{
		this.titre=titre;
		this.nbPages=nbPages;
		this.prixFixe=false;
	}
	public livre (String titre , float nbPages , String auteur)
	{
		this.titre=titre;
		this.nbPages=nbPages;
		this.auteur=auteur;
		this.prixFixe=false;
	}
	public void livre ()
	{
		this.titre="";
		this.nbPages=0;
		this.auteur="";
		this.prix=0;
		this.prixFixe=false;
	}
	public String getTitre ()
	{
		return this.titre ;
	}
	public float getNbPges()
	{
		return this.nbPages;
	}
	public double getPrix()
	{
		return this.prix;
	}
	public void setPrix(double prix)
	{
		if (this.prixFixe==false)
		{
			this.prix=prix;
			this.prixFixe=true;
		}
		else
		{
			System.out.println("Le prix est fixe ");
		}
	}
	public void setAuteur(String auteur)
	{
		this.auteur=auteur;
	}
	public void setTitre(String titre)
	{
		this.titre=titre;
	}
	public String toString()
	{
		return ("Livre intitulé "+ this.titre+" de "+this.auteur+" , contenant "+ this.nbPages+" pages");
	}
	public void decrire()
	{
		System.out.println(this.toString());
	}
	public boolean testPrix()
	{
		return (this.prix==0);
	}
	public double calculPrix()
	{
		return (this.prix*this.tva);
	}
	public static void main(String[] args) {
		Livre[] tabL;
		tabL = new Livre[3];
		tabL[0] = new Livre();
		tabL[0].setTitre("L'alchimiste");
		tabL[0].setAuteur("Coelho");
		tabL[0].setNbPages(225);
		tabL[1] = new Livre ();
		tabL[1].setTitre("La Tunisie");
		tabL[1].setNbPages(508);
		tabL[2] = new Livre ();
		tabL[2].setTitre("JK Rowling");
		tabL[2].setAuteur("Harry Potter");
		System.out.println(tabL[0]);
		System.out.println(tabL[1]);
		System.out.println(tabL[2]);
		tabL[1].setAuteur("Paulo Coelho");
		tabL[2].setNbPages(461);
		tabL[0].decrire();
		tabL[1].decrire();
		tabL[2].decrire();
		double p1;
		
	}
}

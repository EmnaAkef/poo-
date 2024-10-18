package ex3;

public class Livre {
		private String titre, auteur;
		private float nbPages;
		public Livre (String auteur, String titre) 
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
		public String getTitre ()
		{
			return this.titre ;
		}
		public float getNbPges()
		{
			return this.nbPages;
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
		public Livre ()
		{
			nbPages=0;
		}
		public Livre (String titre , float nbPages)
		{
			this.titre=titre;
			this.nbPages=nbPages;
		}
		public Livre (String titre , float nbPages , String auteur)
		{
			this.titre=titre;
			this.nbPages=nbPages;
			this.auteur=auteur;
		}
	public static void main(String[] args) 
	{
		Livre[] tabL;
		tabL = new Livre[3];
		tabL[0] = new Livre("L'alchimiste",225, "Coelho");
		tabL[1] = new Livre ("La Tunisie", 508);
		tabL[2] = new Livre ("JK Rowling","Harry Potter");
		System.out.println(tabL[0]);
		System.out.println(tabL[1]);
		System.out.println(tabL[2]);
		tabL[1].setAuteur("Paulo Coelho");
		tabL[2].setNbPages(461);
		tabL[0].decrire();
		tabL[1].decrire();
		tabL[2].decrire();
	}
}

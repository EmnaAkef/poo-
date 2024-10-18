package ex2;

public class Dictionnaire {
	private int nbMots;
	private MotDico [] dico;
	private String nom;
	public int getNbMots() {
		return nbMots;
	}
	public void setNbMots(int nbMots) {
		this.nbMots = nbMots;
	}
	public MotDico[] getDico() {
		return dico;
	}
	public void setDico(MotDico[] dico) {
		this.dico = dico;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Dictionnaire(int nbMots, MotDico[] dico, String nom) {
		super();
		this.nbMots = nbMots;
		this.dico = dico;
		this.nom = nom;
	}
	public static void main(String[] args) {
		

	}

}

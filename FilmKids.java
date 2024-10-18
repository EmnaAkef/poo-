package Ex2;

public class FilmKids extends Film {
	private int agemin;
	public FilmKids(String titre, String r, String pays, int d, int agemin) {
		super(titre, r, pays, d);
		this.agemin=agemin;
	}
	public String toString()
	{
		return (super.toString()+" l'age minimale des "+this.agemin);
	}

}

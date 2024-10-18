package Ex2;

public class main {

	public static void main(String[] args) {
		JCC jcc= new JCC(2,2021);
		Documentaire f1 = new Documentaire("La guerre civile","Le dernier refuge","Ousman","Mali",86);
		Film f2 = new Film("Insurrection","Jilani Saadi","Tunisie",105);
		FilmKids f3 = new FilmKids("Coco","John","UK",100,10);
		jcc.ajoutFilm(f1);
		f1.setNbr(30);
		jcc.ajoutFilm(f2);
		f2.setNbr(45);
		jcc.ajoutFilm(f3);
		f3.setNbr(50);
		jcc.listeFilmsJCC();
		float bjcc=jcc.totalVenteBilletsJCC();
		System.out.println("Le montant des ventes de billets pour les JCC est "+bjcc);
		System.out.println(Film.idF);
		System.out.println(f1.idF);
	}
}
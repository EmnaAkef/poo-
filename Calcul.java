package tp3;

public class Calcul {

	public static void main(String[] args) {
		Entier e = new Entier();
		Entier a = new Entier();
		System.out.println("le factoriel de 5 est "+ Entier.factoriel(5));
		Entier.absolu(-9);
		Entier.comparer(7,20);
		Entier.premier(3);
		e.premier(7);
		a.incrementer();
		Entier.incrementer();
	}
}

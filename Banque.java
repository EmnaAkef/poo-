package tp3_ex2;

public class Banque {

	public static void main(String[] args) {
		Compte co1 = new Compte();
		Compte co2 = new Compte();
		System.out.println("le num du compte est "+co1.num+"et le solde est "+co1.solde);
		System.out.println("le num du compte est "+co2.num+"et le solde est "+co2.solde);
		co1.deposer(1200);
		co2.deposer(500);
		System.out.println("le solde du 1er compte est "+co1.solde);
		System.out.println("le solde du 2eme compte est "+co2.solde);
		co2.transferer(700, co1);
		if (co1.solde<0)
		{
			System.out.println("le comte num 1 est en rouge avec un solde "+co1.solde);
		}
		if (co2.solde<0)
		{
			System.out.println("le comte num 2 est en rouge avec un solde "+co2.solde);
		}
	}

}

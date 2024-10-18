package tp3_ex2;

public class Compte {
	int num;
	float solde;
	public static int count=0;
	public Compte()
	{
		count++;
		num=count;
		solde=0;
	}
	public void deposer(float m)
	{
		this.solde += m;
	}
	public void retirer(float m)
	{
		this.solde -= m;
	}
	public float avoirSolde()
	{
		return this.solde;
	}
	public void transferer(float m, Compte c)
	{
		this.retirer(m);
		c.deposer(m);
	}
}

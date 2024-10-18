package ex2;

public class MotDico {
	public static int count=0;
	private int num;
	private String mot;
	private String definition;
	public MotDico()
	{
		count++;
		this.num=count;
		this.mot="";
		this.definition="";
	}
	public String getMot()
	{
		return this.mot;
	}
	public String getDefinition()
	{
		return this.definition;
	}
	public void setMot(String mot)
	{
		this.mot=mot;
	}
	public boolean synonyme(MotDico m)
	{
		return (this.mot==m.mot && this.definition==m.definition);
	}
	
}

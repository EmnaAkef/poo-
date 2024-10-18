package Tp1ex2;

public class Point {

		private String nom;
		private int abs;
		private int ord;
		public Point(String c, int x, int y)
		{
			nom=c;
			abs=x;
			ord=y;
		}
		public Point(String c)
		{
			nom=c;
		}
		public Point(int x , int y)
		{
			abs=x;
			ord=y;
		}
		public void affiche ()
		{ 
			System.out.println(nom +"("+abs+","+ord+")");
		}
		void TransHoriz (int a)
		{
			abs += a;
		}
		void TranslVert (int a)
		{
			ord += a;
		}
		void Translation (int a , int b)
		{
			abs += a;
			ord += b;
		}
		boolean Coincide (Point p)
		{
			if (this.nom==p.nom && this.abs==p.abs && this.ord==p.ord)
				return true;
			else
				return false;
					
						
		}
		String getNom()
		{
			return this.nom;
		}
		int getAbscisse()
		{
			return this.abs;	
		}
		int getOrdonnees()
		{
			return this.ord;
		}
		void setNom(String ch)
		{
			this.nom=ch;
		}
		void setAbscisse (int a)
		{
			this.abs=a;
		}
		void setOrdonnee (int a)
		{
			this.ord=a;
		}
}


public class Dichtomie {
	public Polynome pol;
	
	public Dichtomie(Polynome pp)
	{
		pol=pp;
	}
	
	public Double Resoudre(Double a,Double b,Double seuil)
	{
		Double fa=pol.Resoudre(a),fb=pol.Resoudre(b);
		if(fa*fb>=0)
		{
			System.out.println("Pas de solution");
			return 0.0;
		}
		
		Double p=(a+b)/2;
		
		Double fp = pol.Resoudre(p);
		int nb=1;
		
		while(Math.abs(fp)>seuil)
		{
			System.out.println("Dichtomie : "+nb);
			nb++;
			if(fp==0)
			   return p;
			
		if(fp*fa<0)
			b=p;
		
		else {
			a=p;
		}
		
         p=(a+b)/2;
		 fp = pol.Resoudre(p);
		}
		return p;	
	}

}

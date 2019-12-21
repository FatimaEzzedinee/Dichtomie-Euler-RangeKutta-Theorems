import java.util.ArrayList;

public class Euler {
	Polynome poly;
	int nb_Iteration=0;
	Double x0=0.0,y0=1.0;
	
	public Euler(Polynome p)
	{
		poly=p;	
	}
	
	
	public Double Resoudre(Double x)
	{
		Double solution=0.0;
		Double dx=0.0;
		//System.out.println("x0"+x+ " y"+y0+ "x :"+x);
		dx=((double)(x-x0))/this.nb_Iteration;
		
		ArrayList<Double> Y=new ArrayList<Double>();
		ArrayList<Double> X=new ArrayList<Double>();
		
		X.add(0.0);
		Y.add(1.0);
		//System.out.println(dx);
		//System.out.println(x0);
		
		for(int i=0;i<this.nb_Iteration;i++)
		{
			
			//System.out.println(x0);
			X.add(X.get(X.size()-1)+dx);
		}
		
		for(int i=0;i<this.nb_Iteration;i++)
		{
			
			Double yi=Y.get(Y.size()-1) +dx * poly.Resoudre(X.get(Y.size()-1));
			Y.add(yi);
		}
		
		solution=Y.get(Y.size()-1);
		
		return solution;
	}
	

}

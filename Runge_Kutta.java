import java.util.ArrayList;

public class Runge_Kutta {
	
	public Polynome p;
	public Double x0=0.0,y0=1.0;
	public int nb_Iteration=0;
	
	public Runge_Kutta(Polynome po)
	{
		p=po;
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
		
		for(int i=0;i<this.nb_Iteration;i++)
		{
			X.add(X.get(X.size()-1)+dx);
		}
		
		for(int i=0;i<this.nb_Iteration;i++)
		{
			Double k1=p.Resoudre(X.get(Y.size()-1));
			Double k2=p.Resoudre(X.get(Y.size()-1)+((Double)dx)/2);
			Double k3=p.Resoudre(X.get(Y.size()-1)+(Double)dx);
			
			Double yi=Y.get(Y.size()-1) +(((Double)dx)/6) * (k1+4*k2+k3);
			Y.add(yi);
		}
		
		solution=Y.get(Y.size()-1);
		
		return solution;
	}

}

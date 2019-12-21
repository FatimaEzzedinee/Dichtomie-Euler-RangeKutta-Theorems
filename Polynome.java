import java.util.ArrayList;

public class Polynome {
	public ArrayList<Double> poly=new ArrayList<Double>();
	
	public Polynome(ArrayList<Double> po)
	{
		poly=po;
	}
	public Double Resoudre(Double x)
	{
		Double solution=0.0;
		for(int i=0;i<this.poly.size();i++)
		{
			solution+=poly.get(i)*Math.pow(x,i);
		}
		return solution;
	}
	

}

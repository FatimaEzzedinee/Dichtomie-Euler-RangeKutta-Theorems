import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> a=new ArrayList<Double>();
		a.add(1.0);
		a.add(2.0);
		a.add(3.0);
		a.add(4.0);
		Polynome polynome=new Polynome(a);
		System.out.println("P(1)="+polynome.Resoudre(1.0));
		
		
		ArrayList<Double> b=new ArrayList<Double>();
		b.add(1.0);
		b.add(1.0);
		b.add(1.0);
		
		Polynome polynome2=new Polynome(b);
	
		
		Euler euler=new Euler(polynome2);
		
		//euler.x0=0.0;
		//euler.y0=1.0;
		//euler.nb_Iteration=1;
		
		while(true)
		{
			//System.out.println(" Euler Nb_Iteration : " + euler.nb_Iteration + "  P(3)="+euler.Resoudre(3.0));
			
			if(17.5-euler.Resoudre(3.0)<=0.01)
			{
				System.out.println("Euler solution :"+ euler.Resoudre(3.0));
				break;
			}
				
			
			euler.nb_Iteration++;
		}
		
		System.out.println("Euler nb Iteration  : "+euler.nb_Iteration);
		
		Runge_Kutta kuta=new Runge_Kutta(polynome2);
		
		while(true)
		{
		//	System.out.println(" Kouta Nb_Iteration : " + kuta.nb_Iteration + "  P(3)="+kuta.Resoudre(3.0));
			
			if(17.5-kuta.Resoudre(3.0)<=0.5)
			{
				System.out.println("Kuta solution :"+kuta.Resoudre(3.0));
				break;
			}
			
			kuta.nb_Iteration++;
		}
		System.out.println("Kuta nb Iteration  : "+kuta.nb_Iteration);
		
		ArrayList<Double> a3=new ArrayList<Double>();
		
		Polynome polynome3=new Polynome(a3);
		
		a3.add(-5.0);
		a3.add(0.0);
		a3.add(1.0);
		
		Dichtomie dichto = new Dichtomie(polynome3);
		
		System.out.println("Approximation racine 5 : "+ dichto.Resoudre(2.0,3.0,0.0001));
		
		
	}
	

}

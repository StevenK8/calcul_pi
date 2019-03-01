package calcul_pi;

import java.util.Random;

public class Mesure {
	public double n_total, n_cible=0;
	public long valpi;
	public Random rand = new Random();
	
	public Mesure(int par_total){
		n_total = par_total;
	}
	
	public void compte(){
		float x,y;
		for(int i=0; i<n_total; i++){
			x = rand.nextFloat();
			y = rand.nextFloat();
			if(Math.pow(x, 2) + Math.pow(y, 2) < 1){
				n_cible++; //Section critique
			}
		}
	}
	
	public double calcpi(){
		compte();
		return 4*(n_cible/n_total);
	}
}

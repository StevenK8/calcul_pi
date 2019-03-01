package calcul_pi;

public class TestMesure {
	public static double valpi;
	
	public static void main(String[] args) {
		Mesure mes = new Mesure(10000000);
		valpi = mes.calcpi();
		System.out.println(valpi);
	}

}

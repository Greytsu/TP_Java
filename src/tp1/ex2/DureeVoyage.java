package tp1.ex2;

import java.util.ArrayList;

public class DureeVoyage {
	
	private int heureDepart, minuteDepart, heureArrivee, minuteArrivee;
	
	public DureeVoyage(String[] args) {
		
		var heures = new HeuresVoyage();
		ArrayList<Integer> tabHeures = heures.get(args);
			
		System.out.println(tabHeures.get(0));
		
		for (Integer elem : tabHeures) {
			System.out.println(elem);
		}
		
	}
}

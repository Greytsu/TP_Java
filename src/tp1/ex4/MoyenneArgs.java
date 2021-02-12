package tp1.ex4;

import java.util.ArrayList;

public class MoyenneArgs {
	
	double moyenne = 0;
	private ArrayList<Double> arrayNotes = new ArrayList<Double>();
	
	
	public void getNotes(String[] args) {
		
		var converter = new StrToDouble();
		
		for (String note : args) {
			if (converter.convert(note).isPresent()) {
				this.arrayNotes.add(converter.convert(note).get());
			}
		}		
	}
	
	public void printMoyenne() {
		
		double somme = 0;
		
		if (this.arrayNotes.size() < 2) {
			System.out.println("Pas assez de notes pour calculer une moyenne");
		} else {
			
			for (Double note : this.arrayNotes) {
				somme += note;
			}
			System.out.print("Moyenne des notes : ");
			System.out.println(somme / this.arrayNotes.size());
			
		}
	}

}

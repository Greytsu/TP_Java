package tp1.ex2;

import java.util.ArrayList;
import tp1.ex1.StrToInt;

public class HeuresVoyage {
	
	public ArrayList<Integer> get(String[] args){
		
		var tabHeures = new ArrayList<Integer>();
		var converter = new StrToInt();
		
		for (String elem : args) {
			
			var value = converter.convert(elem);
			
			if (value.isPresent()) {
				tabHeures.add(value.get());
			}
			
		}
		
		return tabHeures;
	}

}

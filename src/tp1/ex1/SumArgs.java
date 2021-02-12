package tp1.ex1;

import java.util.ArrayList;

public class SumArgs {
	
	public int convertArgs(String[] args) {
		
		var tabInt = new ArrayList<Integer>();
		//var converter = new StrToInt();
		var sumArray = new SumArrayList(tabInt);
		
		for (String toConvert : args) {
			
			//var value = converter.convert(toConvert);
			var value = StrToInt.convertStat(toConvert);
			
			if (value.isPresent()) {
				tabInt.add(value.get());
			}
			
		}
		
		return sumArray.sum();
		
	}

}

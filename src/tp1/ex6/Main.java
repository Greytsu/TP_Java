package tp1.ex6;

import tp1.ex1.StrToInt;

public class Main {

	public static void main(String[] args) {

		int[] tab = {2, 4, 6, 9, 12, 13, 24, 76};
		
		if (args.length == 1) {

			var converter = new StrToInt();
			int entier = converter.convert(args[0]).get();
			
			var chercheTab = new InTab(tab, entier);
			chercheTab.binarySearch();
			
		}

	}

}

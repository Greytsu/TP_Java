package tp1.ex5;

import tp1.ex1.StrToInt;

public class Main {

	public static void main(String[] args) {

		if (args.length == 1) {

			var converter = new StrToInt();
			int entier = converter.convert(args[0]).get();
			
			var factorielle = new Factorielle(entier);
			factorielle.calculFactorielle();
			
		}

	}

}

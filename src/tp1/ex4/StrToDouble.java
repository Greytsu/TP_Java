package tp1.ex4;

import java.util.Optional;

public class StrToDouble {

	public Optional<Double> convert(String entier) {

		try {
			return Optional.of(Double.parseDouble(entier));
		}
		catch(NumberFormatException err){
			System.err.println("Not a Double");
			return Optional.empty();
		}

	}
}

package tp1.ex1;
import java.util.Optional;

public class StrToInt {
	
	public Optional<Integer> convert(String entier) {

		try {
			return Optional.of(Integer.parseInt(entier));
		}
		catch(NumberFormatException err){
			System.err.println("Not an Integer");
			return Optional.empty();
		}

	}
	
	public static Optional<Integer> convertStat(String entier) {

		try {
			return Optional.of(Integer.parseInt(entier));
		}
		catch(NumberFormatException err){
			System.err.println("Not an Integer");
			return Optional.empty();
		}

	}


}

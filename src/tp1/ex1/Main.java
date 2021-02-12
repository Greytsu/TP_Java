package tp1.ex1;

public class Main {

	public static void main(String[] args) {
		
		var converter = new SumArgs();
		int sumArgs;
		
		sumArgs = converter.convertArgs(args);
		System.out.println(sumArgs);
		
	}

}
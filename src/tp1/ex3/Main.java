package tp1.ex3;

public class Main {

	public static void main(String[] args) {

		var calculatrice = new Calcul();
		calculatrice.getCalcul();
		
		System.out.print("Le resultat de votre calcul : ");
		System.out.println(calculatrice.calcul());
		
	}

}

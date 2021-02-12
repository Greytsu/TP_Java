package tp1.ex3;

import java.util.Scanner; 
import tp1.ex1.StrToInt;

public class Calcul {
	
	private int nombre1, nombre2;
	private String operateur;
	
	public void getCalcul() {
		
		Scanner scan = new Scanner(System.in);
		var converter = new StrToInt();
		String input;
		
		//Nombre 1----------------------------------------------------------
		System.out.println("Entrer un nombre : ");
		input = scan.next();
		
		while (converter.convert(input).isEmpty()) {
			input = scan.next();
		}
		
		this.nombre1 = converter.convert(input).get();
		
		//Operateur---------------------------------------------------------
		System.out.println("Entrer un operateur : ");
		input = scan.next();
		
		this.operateur = input;
		
		
		
		//Nombre 2----------------------------------------------------------
		System.out.println("Entrer un nombre : ");
		input = scan.next();
		
		if (this.operateur.equals("/")) {
			while (converter.convert(input).isEmpty() || converter.convert(input).get() == 0) {
				input = scan.next();
				
			}
		}else {
			while (converter.convert(input).isEmpty()) {
			input = scan.next();
			
			}
		}
		
		this.nombre2 = converter.convert(input).get();			
		
	}
	
	public double calcul() {
		
		double res = 0;
		
		if (this.operateur.equals("+")) {
			res = this.nombre1 + this.nombre2;
		}
		else if (this.operateur.equals("-")) {
			res = this.nombre1 - this.nombre2;
		}
		else if (this.operateur.equals("/")) {
			res = this.nombre1 / this.nombre2;
		}
		else if (this.operateur.equals("*")) {
			res = this.nombre1 * this.nombre2;
		}else {
			
		}
		
		return res;
		
	}

}

package tp1.ex5;

public class Factorielle {
	
	private int a;
	
	public Factorielle(int entier) {
		
		this.a = entier;	
	}
	
	public void calculFactorielle() {
		
		int res = 1;
		
		for (int i = 1; i < this.a + 1; i++) {
			res = res * i;
		}
		
		System.out.println(res);
		
	}

}

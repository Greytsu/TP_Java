package tp1.ex6;

public class InTab {
	
	int[] tabInt;
	int cherche;
	

	public InTab(int[] tabInt, int cherche) {
		
		this.tabInt = tabInt;
		this.cherche = cherche;
		
	}
	
	public void search() {
		for (int i = 0; i < this.tabInt.length; i++) {
			
			if (tabInt[i] == cherche) {
				System.out.print("Element trouve a la position ");
				System.out.println(i + 1);
				return;
			}
		}
		
		System.out.println("L'element n'a pas ete trouve");
	}
	
	public void binarySearch() {
		
		/**
		 * Recherche dichotomoique sur la liste
		 */
		
		int first = 0;
		int last = this.tabInt.length;
		
		while (first != last) {
			
			int mid = (first + last) / 2;
			
			if (this.tabInt[mid] == cherche) {
				System.out.print("Element trouve a la position ");
				System.out.println(mid + 1);
				return;
			}
			else if (this.tabInt[mid] > cherche) {
				last = mid - 1;
			}
			else if (this.tabInt[mid] < cherche) {
				first = mid + 1;
			}
			
		}
		
		System.out.println("L'element n'a pas ete trouve");
		
	}

}

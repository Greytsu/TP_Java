package tp1.ex1;
import java.util.ArrayList;

public class SumArrayList {
	
	private ArrayList<Integer> tabInt;

	public SumArrayList(ArrayList<Integer> tabInt) {
		
		this.tabInt = tabInt;
		
	}
	
	public int sum() {
		
		int res = 0;
		
		for (Integer elem : this.tabInt) {
			res += elem;
		}
		
		return res;
	}
	
}

import java.util.Stack;


public class Program {
	
	public static final int SIZE = 3;

	
	public static void main(String[] args) {
		Hanoi hanoi = new Hanoi(3);
		
		//hanoi.printTowers();
		hanoi.solve();
		

	}

}

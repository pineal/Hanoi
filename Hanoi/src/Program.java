import java.util.Scanner;
import java.util.Stack;


public class Program {
	
	public static void main(String[] args) {
		
		System.out.print("Enter size: ");
		int size = new Scanner(System.in).nextInt();
		
		Hanoi hanoi = new Hanoi(size);
		
		hanoi.solve();
		
		System.out.println("moves needed: " + hanoi.getMoves());
	}

}

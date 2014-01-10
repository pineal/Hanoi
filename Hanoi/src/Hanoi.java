
public class Hanoi {

	Tower t1, t2, t3;
	int moves;
	
	public Hanoi(int size) {
		t1 = new Tower();
		t2 = new Tower();
		t3 = new Tower();
		
		for(int i = size; i >= 1; i--) {
			t1.push(i);
		}
	}
	
	private void print(Tower t, int i) {
		if(i < t.size()) {
			System.out.print(t.get(i));
		}
		else
			System.out.print("-");
	}
	
	
	public void printTowers() { 
		int max = Math.max(t1.size(), Math.max(t2.size(), t3.size()));
		
		for(int i = 0; i < max; i++) {
			print(t1, max - i - 1);
			System.out.print("\t");
			print(t2, max - i - 1);
			System.out.print("\t");
			print(t3, max - i - 1);
			
			System.out.println();
		}
	}
	
	public void solve() {
		moves = 0;
		printTowers();
		System.out.println("---------------------------------------------------");
		moveTower(t1, t2, t3, t1.size());
	}
	
	public int getMoves() {
		return moves;
	}
	
	public void moveTower(Tower src, Tower help, Tower dest, int count) {
		if(count > 1) {
			moveTower(src, dest, help, count - 1);
			move(src, dest);
			moveTower(help, src, dest, count - 1);
		}
		else {
			move(src, dest);
		}
		
	}
	
	public void move(Tower src, Tower dest) {
		if(dest.empty() || src.peek() < dest.peek()) {
			dest.push( src.pop());
			moves++;
		}	
		else {
			printTowers();
			System.out.println("ungültiger spielzug!!");
			System.exit(0);
		}
		
		
		printTowers();
		System.out.println("---------------------------------------------------");
	}
}

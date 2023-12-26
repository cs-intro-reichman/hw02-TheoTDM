/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int r1 = (int) ((Math.random() * 10));
		System.out.print(r1);
		int r2 = (int) ((Math.random() * 10));
		while (r1 <= r2){
			System.out.print(" " + r2);
			r1 = r2;
			r2 = (int) ((Math.random() * 10));
		}
	}
}

/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int p = Integer.parseInt(args[0]);
		int sum = 1;
		String s = p + " is a perfect number since " + p + " = 1";
		for (int i = 2; i <= p/2 + 1; i++) {
			if (p % i == 0) {
				sum = sum + i;
				s = s + " + " + Integer.toString(i);
			}
		}
		if (p == sum){
			System.out.println(s);
		}
		else {
			System.out.println(p + " is not a perfect number");
		}
	}
}

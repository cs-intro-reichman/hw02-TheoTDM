/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		char mid = s.charAt(s.length() / 2);
		String rvrs = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rvrs = rvrs + s.charAt(i);
		}
		System.out.println(rvrs);
		System.out.println("The middle character is " + mid);
	}
}

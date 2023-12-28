/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		boolean t = true;
		for (int j = 0; j < x; j++){
			System.out.println(" ");
			for (int i = 0; i < x; i++){
				if (t){
					if (i == (x - 1)){
						System.out.print("*");
					}
					else {
					System.out.print("* ");
					}
				}
				else {
					System.out.print(" *");
				}
			}
			t = !t;
		}
	}
}

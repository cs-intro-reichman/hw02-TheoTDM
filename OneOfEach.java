
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean b = false;
		boolean g = false;
		int sum = 0;
		while (!b || !g){
			sum += 1;
			int c = (int) ((Math.random() * 2));
			if (c == 0){
				System.out.print("g ");
				g = true;
			}
			else {
				System.out.print("b ");
				b =true;
			
			}
		}
		System.out.println("\r\n" + "You made it... and you now have " + sum + " children.");
	}
}

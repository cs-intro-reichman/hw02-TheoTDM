/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int t = Integer.parseInt(args[0]);
		int count = t;
		int f2 = 0;
		int f3 = 0;
		int f4 = 0;
		while (count != 0) {
			boolean b = false;
			boolean g = false;
			int sum = 0;
			while (!b || !g){
				sum += 1;
				int c = (int) ((Math.random() * 2));
				if (c == 0){
					g = true;
				}
				else {
					b =true;
			
				}
			}
			if (sum == 2){
				f2 += 1;
			}
			else if (sum == 3){
				f3 += 1;
			}
			else {
				f4 +=1;
			}
			count -= 1;
		}
		double avg = ((2 * f2) + (3 * f3) + (4 * f4)) / (double)t;
		String mode = "4 or more";
		if (f2 >= f3 && f2 >= f4){
			mode = "2"; 
		} 
		else if (f3 >= f4){
			mode = "3";
		}
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + f2);
		System.out.println("Number of families with 3 children: " + f3);
		System.out.println("Number of families with 4 or more children: " + f4);
		System.out.println("The most common number of children is " + mode);
	}
}

package assingment1;
/*
 Write a java program to exchange the values of two variables of integer type X and Y using
third temporary variable Z
 */
public class question7 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = y;
		y = x;
		x = z;
		System.out.println("value of x =" + " " + x + " " + "value of y =" + y);
		
		/*
		 output = value of x = 20 value of y =10
		
		 */

		
	
	}

}

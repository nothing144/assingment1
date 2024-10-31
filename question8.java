package assingment1;
/*
 Write a java program to exchange the values of two variables of integer type X and Y without
using third temporary variable.
 */



public class question8 {
	public static void main(String[] args) {
		int x = 33;
		int y = 34;
		x = x*y;
		y = x/y;
		x = x/y;
		System.out.println("value of x =" + " " + x + " " + "value of y =" + y); 
		/*
		 output = value of x = 34 value of y =33

		 */
		
	}

}

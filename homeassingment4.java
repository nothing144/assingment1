package assingment1;
/*
 Suppose that a variable a is declared as double a = 3.14159. What do each of the following
print?
a) System.out.println(a);
b) System.out.println(a+1);
c) System.out.println(8/(int) a);
d) System.out.println(8/a);
e) System.out.println((int) (8/a));
 */

public class homeassingment4 {
	public static void main(String[] args) {
		 double a = 3.1415;
				
		System.out.println(a);
		System.out.println(a+1);
		 System.out.println(8/(int) a);
		 System.out.println(8/a);
		 System.out.println((int) (8/a));
		 /*
		  output
		  3.1415
                  4.141500000000001
                  2
                  2.546554193856438
                  2
		  */
	}

}

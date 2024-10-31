package assingment1;
/*
 Write a java program to store your Bank account no, name and balance in three different
variables and display their value on the screen as given:
“My name is Amit Kumar bearing account number 123456
having balance 7654.98”
 */

public class question6 { 
	public static void main(String[] args) {
		String name = "Amit Kumar";
		long AccountNumber = 123456;
		float Balance = 7654.98f;
		
		System.out.println("My name is" + " " + name + " " + "bearing account number" + " " + AccountNumber + " " + "having balance" + " " + Balance);
		/*
		 output = My name is Amit Kumar bearing account number 123456 having balance 7654.98
		 */
	}

}

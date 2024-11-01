package assingment1;
/*
 Write a java program to exchange the value of 4 variables W,G,K,A such that the value of
W will move to A, A to K, K to G and finally G to W. Exchange using with and without
using extra variables
 */

public class homeassingment5SecondPart {
	public static void main(String[] args) {
		//without using extra variable 
		    int W = 1;
	        int G = 2;
	        int K = 3;
	        int A = 4;
	        
	        // Swapping without using an extra variable
	        W = W + G + K + A; // W now holds the sum of all variables
	        A = W - (A + G + K);// A gets the value of W (initially)
	        K = W - (A + G + K); // K gets the value of G (initially
	        G = W - (A + G + K);// G gets the value of K (initially)
	        W = W - (A + G + K);// W gets the value of A (initially)
	        
	        System.out.println("After swapping:");
	        System.out.println("W = " + W);
	        System.out.println("G = " + G);
	        System.out.println("K = " + K);
	         System.out.println("A = " + A);
	         /*
	          output
	          After swapping:
                  W = 2
                  G = 3
                  K = 4
                  A = 1

	          */
	}

}

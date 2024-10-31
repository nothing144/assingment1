package assingment1;
/*
 Write a java program to exchange the value of 4 variables W,G,K,A such that the value of
W will move to A, A to K, K to G and finally G to W. Exchange using with and without
using extra variables
 */

public class homeassingment5 {
	public static void main(String[] args) {
		//exchange using extra variable
		
        int w = 1;
        int g = 2;
        int k = 3;
        int a = 4;
        int z = w;
        w = g;
        g = k;
        k = a;
        a = z;
        System.out.println(w);
        System.out.println(g);
        System.out.println(k);
        System.out.println(a);
        /*
        2
        3
        4
        1

         */
       
       

       
		
		
		
		
	}

}

package clear02;

import java.util.Scanner;

public class Test2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M-45<0 & H>=1) System.out.println((H-1)+" "+(M+15)); // -45+60
		else if(M-45<0 & H<1) System.out.println("23 "+(M+15));
		else System.out.println(H+" "+(M-45));
	}	
}

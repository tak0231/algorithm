package clear01;

import java.util.Scanner;

public class Test2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int result1=A*(B%10);
		int result2=A*(B/10%10);
		int result3=A*=(B/100%10);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result1+result2*10+result3*100);
	}	
}

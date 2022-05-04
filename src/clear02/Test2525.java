package clear02;

import java.util.Scanner;

public class Test2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A=sc.nextInt();
		int B=sc.nextInt();
		
		int t = sc.nextInt();

		int h=t/60;
		int m=t%60;
		
		if(B+m>=60) {
			 h+=1;
			 B=B+m-60;
		} else {
			B=B+m;
		}
		
		if(A+h>=24) {
			A=A+h-24;
		} else {
			A=A+h;
		}

		System.out.println(A+" "+B);

	}
}

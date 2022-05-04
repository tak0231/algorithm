package clear01;

import java.util.Scanner;

public class Test1008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		/*
		 [double vs float]
		 - 범위 차이 / 나눗셈 시 출력되는 소수점 자리수가 달라짐
		 double
		 float
		 */
		
		double ans = (double) A/B;
		
		System.out.println(ans);
	}
}

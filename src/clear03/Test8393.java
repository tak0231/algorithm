package clear03;

import java.util.Scanner;

public class Test8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int roop=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=roop;i++) {
			sum+=i;
		}
		
		System.out.println(sum);
	}
}

package clear03;

import java.util.Scanner;

public class Test2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for(int i=1;i<=N;i++) {
			System.out.print(" ".repeat(N-i));
			System.out.print("*".repeat(i)); 
			System.out.print("\n");
		}
	}
}

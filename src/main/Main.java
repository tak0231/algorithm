package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}

		Test test = new Test();
		System.out.println(test.sum(a));
	}
}

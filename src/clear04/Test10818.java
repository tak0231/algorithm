package clear04;

import java.util.Arrays;
import java.util.Scanner;

public class Test10818 {
	// Arrays.sort()를 이용한 방법
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] num = new int[N];
		int min = 0;
		int max = 0;
		
		for(int i=0;i<N;i++) {
			num[i]=sc.nextInt();
		}
		
		Arrays.sort(num);
		min = num[0];
		max = num[N-1];
		
		System.out.println(min+" "+max);
	}
/*
 * 1차원 배열만 이용하는 방법
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] num = new int[N];
		
		for(int i=0;i<N;i++) {
			num[i]=sc.nextInt();
		}
		
		int max = num[0];
		int min = num[0];
		
		for(int i=0;i<N;i++) {
			if(num[i]<min) min = num[i];
			if(num[i]>max) max = num[i];
		}
		
		System.out.println(min+" "+max);
	}
*/
/*
 * 배열 없이 구하는 방법
 * 속도 가장 빠름
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		int max = -1000000;
		int min = 1000000;
		
		for(int i=0;i<N;i++) {
			int num = sc.nextInt();
			
			if(num<min) min = num;
			if(num>max) max = num;
		}
		
		System.out.println(min+" "+max);
	}
*/
}

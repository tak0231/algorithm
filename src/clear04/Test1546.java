package clear04;

import java.util.Scanner;

public class Test1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int M = 1;
		float sum = 0;
		
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>M) M=arr[i];
			sum+=arr[i];
		}
		
		System.out.println(((sum/M)*100)/arr.length);
	}
}

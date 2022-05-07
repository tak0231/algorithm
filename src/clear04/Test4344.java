package clear04;

import java.util.Scanner;

public class Test4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int C = sc.nextInt();
		int N = 0;
		int[] arr = {};
		float sum = 0;
		float avg = 1;
		int cnt=0;
		double result=0;
		
		for(int i=0;i<C;i++) {
			N = sc.nextInt();
			arr = new int[N];
			sum = 0;
			avg = 1;
			cnt = 0;
			
			
			for(int j=0;j<N;j++) {
				arr[j]=sc.nextInt();
				
				sum+=arr[j];
			}
			
			if(sum==0) avg=1;
			else avg = sum/arr.length;
			
			for(int j=0;j<N;j++) {
				if(arr[j]>avg) cnt++;
			}
			
			result = (double) cnt/arr.length*100;
			System.out.println(String.format("%.3f",result)+"%");
		}
	}
}

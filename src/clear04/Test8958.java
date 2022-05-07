package clear04;

import java.util.Scanner;

public class Test8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = 0;
		int sum = 0;
		int N = sc.nextInt();
		String[] arr = new String[N];
		String[] str = {};
		
		for(int i=0;i<N;i++) {
			arr[i]=sc.next();
		}
		
		for(int i=0;i<arr.length;i++) {
			str=arr[i].split("");
			for(int j=0;j<str.length;j++) {
				if(str[j].equals("O")) {
					cnt++;
					sum+=cnt;
				} else {
					cnt = 0;
				}
			}
			

			System.out.println(sum);
			cnt = 0;
			sum = 0;
		}
		
	}
}

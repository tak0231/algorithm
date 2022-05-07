package clear04;

import java.util.Scanner;

public class Test2577 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);		
		
		int[] cnt = {0,0,0,0,0,0,0,0,0,0};
		int index = 0;
		int A = sc.nextInt();
		int B = sc.nextInt();		
		int C = sc.nextInt();
		
		String[] str = String.valueOf(A*B*C).split("");
		for(int i=0;i<str.length;i++) {
			index = Integer.parseInt(str[i]);
			cnt[index]++;
		}
		
		for(int i=0;i<=9;i++) {
			System.out.println(cnt[i]);
		}
	}
}

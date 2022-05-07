package clear04;

import java.util.Scanner;

public class Test2562 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int[] num = new int[9];
		int index = 1;
		
		for(int i=0;i<9;i++) {
			num[i]=sc.nextInt();
		}
		
		int max = num[0];
		
		for(int i=0;i<9;i++) {
			if(num[i]>max) {
				max = num[i];
				index = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}
}

package clear03;

import java.util.Scanner;

public class Test1110 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int target = sc.nextInt();	// 목표
		int num = target;			// 반복문에 사용되는 숫자
		String str1 = "";			// 문자로 바꾼 num
		int sum = 0;				// 자릿수 숫자들의 합
		String str2 = "";			// 문잘로 바꾼 sum
		int result = 0;				// 결과값
		int cnt = 0;				// 시행 횟수
		
		while(true) {
			sum=0;
			str1 = String.valueOf(num);
			
			if(num<10) str1 = "0"+str1;
			
			for(int i=0;i<str1.length();i++) {
				sum += Integer.parseInt(str1.split("")[i]);
			}
			str2 = String.valueOf(sum);
			result=Integer.parseInt(str1.split("")[str1.length()-1]+str2.split("")[str2.length()-1]);
			
			cnt++;
			if(result == target) break;
			num = result;
		}
		
		System.out.println(cnt);
	}
}

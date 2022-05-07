package clear03;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Test10871 {
	public static void main(String[] args) throws IOException{
		Scanner sc= new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			int A = sc.nextInt();
			if(A<X) bw.write(A+" ");
		}
		

		bw.flush();
		bw.close();
	}
}

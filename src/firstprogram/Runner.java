package firstprogram;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		solution.print(n);
        s.close();
	}
	

	public class solution {

		public static void print(int n) {
			//Write your code here
			
			int size=2*n-1;
			int no=n;
			int i=1;
			
			for(int j=n;i>=0;i--) {
				for(int k=1;k<=n;k++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}

	}
}

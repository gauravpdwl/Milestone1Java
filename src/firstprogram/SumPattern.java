package firstprogram;

import java.util.Scanner;

public class SumPattern {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		int i=1;
		while(i<=no) {
			
			int j=1;
			while(j<=i) {
				
				System.out.print(j);
				
				if(j<i) {
					System.out.print('+');
				}else if(j==i) {
					System.out.print('=');
				}
				
				j+=1;
				
				if(j>i) {
					int sum=0;
					int k=1;
					while(k<=i) {
						sum=sum+k;
						k+=1;
					}
					System.out.print(sum);
				}
				
			}
			
			System.out.println();
			i+=1;
			
		}
	}
}

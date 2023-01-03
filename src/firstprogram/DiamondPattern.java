package firstprogram;
import java.util.Scanner;

public class DiamondPattern {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		if(no==0) {
			System.out.print('*');
			System.out.println();
			System.out.print('*');
			
		}else {
			int p1=no+1;
			int i=1;
			while(i<=p1) {
				if(i==1) {
					System.out.print('*');
				}
				else {
					System.out.print('*');
					
					int j=1;
					while(j<=i-1) {
						System.out.print(j);
						j+=1;
					}
					
					int k=i-2;
					while(k>=1) {
						System.out.print(k);
						k-=1;
					}
					
					System.out.print('*');
				}
				System.out.println();
				i+=1;
			}
			
			int p2=no;
			i=1;
			while(i<=p2) {
				if(i==p2) {
					System.out.print('*');
				}
				else {
					System.out.print('*');
						
					int j=1;
					while(j<=p2-i) {
						System.out.print(j);
						j+=1;
					}
					
					int k=p2-i-1;
					while(k>=1) {
						System.out.print(k);
						k-=1;
					}
					
					System.out.print('*');
				}
				
				System.out.println();
				i+=1;
			}
		}
		
		
	
	}
}

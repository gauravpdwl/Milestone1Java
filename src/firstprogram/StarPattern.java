package firstprogram;
import java.util.Scanner;

public class StarPattern {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		int p1=(no+1)/2;
		int p2=p1-1;
		int i=1;
		while(i<=p1) {
			
			int s=p1-1;
			while(s>=i) {
				System.out.print(' ');
				s-=1;
			}
			
			int j=1;
			while(j<=i) {
				System.out.print('*');
				j+=1;
			}
			
			int k=i-1;
			while(k>=1) {
				System.out.print('*');
				k-=1;
			}
			
			System.out.println();
			i+=1;
		}
		
		i=1;
		while(i<=p2) {
			
			int s=1;
			while(s<=i) {
				System.out.print(' ');
				s+=1;
			}
			
			int j=p2;
			while(j>=i) {
				System.out.print('*');
				j-=1;
			}
			
			int k=p2-1;
			while(k>=i) {
				System.out.print('*');
				k-=1;
			}
			
			System.out.println();
			i+=1;
		}
		
		
	}
}

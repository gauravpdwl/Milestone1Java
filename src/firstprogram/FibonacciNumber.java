package firstprogram;
import java.util.Scanner;

public class FibonacciNumber {
	
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		int i=3;
		int f1=1;
		int f2=1;
		int fn=0;
		
		while(i<=no) {
			fn=f1+f2;
			f1=f2;
			f2=fn;
			i+=1;
		}
		
		if(no==1) {
			System.out.print(f1);
		}else if(no==2) {
			System.out.print(f2);
		}else{
			System.out.print(fn);
		}
		
	}
}

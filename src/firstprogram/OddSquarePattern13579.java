package firstprogram;
import java.util.Scanner;

public class OddSquarePattern13579 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		int maxValue=2*no-1;
		int i=1;
		
		while(i<=no) {
			int valueToPrint=2*i-1;
			int j=1;
			while(j<=no) {
				System.out.print(valueToPrint);
				valueToPrint+=2;
				if(valueToPrint>maxValue) {
					valueToPrint=1;
				}
				j+=1;
			}
			System.out.println();
			i+=1;
		}
	}
}


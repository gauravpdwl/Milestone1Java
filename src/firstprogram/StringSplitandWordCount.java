package firstprogram;

import java.util.Scanner;

public class StringSplitandWordCount {
	
	public static void main(String []args) {
		
		String str="My name is gaurav";
		Scanner sc=new Scanner(str);
		
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("--------------------");
		int count=0;
		while(sc.hasNext()) {
			sc.next();
			count++;
		}
		System.out.println("Words count-"+count);
	}
	
}
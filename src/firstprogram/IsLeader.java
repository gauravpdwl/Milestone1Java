package firstprogram;

import java.util.Arrays;
import java.util.Scanner;

public class IsLeader {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++){
			input[i] = s.nextInt();
		}
		Solution.leaders(input);		
	}
	
	public class Solution {

		public static void leaders(int[] input) {
			
			 for(int i=input.length-1;i>=0;i--){
				 boolean lead=isLeader(input, i+1);
				 if(lead==true) {
					 System.out.print(input[i]+" ");
				 }
			 }
			
		}
		
		public static boolean isLeader(int []arr, int start) {
			if(start>=arr.length) {
				return true;
			}
			int a[]=new int[arr.length-start];
			int j=0;
			for(int i=start;i<arr.length;i++) {
				a[j]=arr[i];
				j++;
			}
			Arrays.sort(a);
//			System.out.println(start);
//			System.out.println(a.length);
			if(arr[start-1]>=a[a.length-1]) {
				return true;
			}
			return false;
		}
		
	}

}
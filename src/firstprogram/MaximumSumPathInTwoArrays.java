package firstprogram;

import java.util.Scanner;

public class MaximumSumPathInTwoArrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int input1[] = new int[m];
        for(int i = 0; i < m; i++) {
        	input1[i] = s.nextInt();
        }
        int n = s.nextInt();
        int input2[] = new int[n];
        for(int i = 0; i < n; i++) {
        	input2[i] = s.nextInt();
        }
        System.out.println(Solution.maximumSumPath(input1, input2));
	}
	
	public class Solution {

		public static long maximumSumPath(int[] input1, int[] input2) {
			int sum1=0;
			int sum2=0;
			long sum=0;
			int i=0;
			int imax=0;
			int j=0;
			int jmax=0;
			
			
			while(i<input1.length || j<input2.length) {
				
				boolean match=false;
				
				for(int k=i;k<input1.length;k++) {
					for(int l=j;l<input2.length;l++) {
						if(input1[k]==input2[l]) {
								imax=k;
								jmax=l;
								match=true;
								break;
						}
					}
					if(match==true) {
						break;
					}
				}
				
				if(match==false) {
					imax=input1.length-1;
					jmax=input2.length-1;
				}
				
				for(int m=i;m<=imax;m++) {
					sum1=sum1+input1[m];
				}
				
				for(int n=j;n<=jmax;n++) {
					sum2=sum2+input2[n];
				}
				
				if(sum1>sum2) {
					sum=sum+sum1;
				}else {
					sum=sum+sum2;
				}
				
				i=imax+1;
				j=jmax+1;
				sum1=0;
				sum2=0;
				
			}
			
			return sum;
			
		}
	}

}
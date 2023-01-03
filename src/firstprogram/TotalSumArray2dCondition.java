package firstprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TotalSumArray2dCondition {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[][] take2DInput() throws IOException {
        int n = Integer.parseInt(br.readLine().trim());

        if (n == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[n][n];

        for (int row = 0; row < n; row++) {
            String[] strNums; 
            strNums = br.readLine().trim().split("\\s");
            
            for (int col = 0; col < n; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            Solution.totalSum(mat);
            System.out.println();

            t -= 1;
        }
    }
    
    public class Solution {

    	public static void totalSum(int[][] mat) {
    		//Your code goes here
    		int n=mat.length;
    		int sum=0;
    		
    		for(int i=0;i<n;i++) {
    			sum=sum+mat[0][i];
    			sum=sum+mat[n-1][i];
    		}
    		
    		for(int i=1;i<n-1;i++) {
    			sum=sum+mat[i][0];
    			sum=sum+mat[i][n-1];
    		}
    		
    		for(int i=1;i<n-1;i++) {
    			sum=sum+mat[i][i];
    			sum=sum+mat[i][n-i-1];
    		}
    		
    		if(n%2==1) {
    			sum-=mat[n/2][n/2];
    		}
    		
    		System.out.println(sum);
    		
    	}

    }
}























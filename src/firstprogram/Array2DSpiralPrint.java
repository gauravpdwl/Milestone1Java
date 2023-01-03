package firstprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array2DSpiralPrint {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[][] take2DInput() throws IOException {
        String[] strRowsCols = br.readLine().trim().split("\\s");
        int n_rows = Integer.parseInt(strRowsCols[0]);
        int m_cols = Integer.parseInt(strRowsCols[1]);

        if (n_rows == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[n_rows][m_cols];

        for (int row = 0; row < n_rows; row++) {
            String[] strNums; 
            strNums = br.readLine().trim().split("\\s");
            
            for (int col = 0; col < m_cols; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            Solution.spiralPrint(mat);
            System.out.println();

            t -= 1;
        }
    }
    
    public class Solution {

    	public static void spiralPrint(int matrix[][]){
    		//Your code goes here
    		int rows=matrix.length;
    		if(rows==0) {
    			return;
    		}
    		int cols=matrix[0].length;
    		int nocount=0;
    		int totalcount=rows*cols;
    		
    		int colstart=0;
    		int colend=cols;
    		int rowstart=0;
    		int rowend=rows;
    		
    		while(true) {
    			
    			for(int i=colstart;i<colend;i++) {
        			System.out.print(matrix[rowstart][i]+" ");
        			nocount++;
        			if(nocount==totalcount) {
        				return;
        			}
        		}
        		rowstart++;
        		
        		for(int i=rowstart;i<rowend;i++) {
        			System.out.print(matrix[i][colend-1]+" ");
        			nocount++;
        			if(nocount==totalcount) {
        				return;
        			}
        		}
        		colend--;
        		
        		for(int i=colend-1;i>=colstart;i--) {
        			System.out.print(matrix[rowend-1][i]+" ");
        			nocount++;
        			if(nocount==totalcount) {
        				return;
        			}
        		}
        		rowend--;
        		
        		for(int i=rowend-1;i>=rowstart;i--) {
        			System.out.print(matrix[i][colstart]+" ");
        			nocount++;
        			if(nocount==totalcount) {
        				return;
        			}
        		}
        		colstart++;
    			
    		}
    		
    		
    	}
    }
}



























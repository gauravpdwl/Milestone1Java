package firstprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquilibriumIndex {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
        String[] strNums; 
        strNums = br.readLine().split("\\s");
        

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] arr = takeInput();
            System.out.println(Solution.arrayEquilibriumIndex(arr));

            t -= 1;
        }
    }
    
    public class Solution {

    	public static int arrayEquilibriumIndex(int[] arr){  
    		//Your code goes here
    		
    		for(int i=0;i<arr.length;i++) {
    			
    			int j=0;
    			int k=i+1;
    			int lsum=0;
        		int rsum=0;
    			
        		while(j<i) {
    				lsum=lsum+arr[j];
    				j++;
    			}
        		
        		while(k<arr.length) {
        			rsum=rsum+arr[k];
        			k++;
        		}
        		
        		if(lsum==rsum) {
        			return i;
        		}
    		}
    		
    		return -1;
    	}
    }
}

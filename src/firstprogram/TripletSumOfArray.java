package firstprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TripletSumOfArray {

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
            int num = Integer.parseInt(br.readLine().trim());
            System.out.println(Solution.tripletSum(arr, num));

            t -= 1;
        }
    }
    	
    public class Solution {	

    	public static int tripletSum(int[] arr, int num) {
    		int i=0;
    		int j=i+1;
    		int k=j+1;
    		int count=0;
    		
    		while(i<arr.length-2 || j<arr.length-1 || k<arr.length) {
    			
    			if(k==arr.length) {
    				j++;
    				if(j<arr.length-1) {
    					k=j+1;
    				}
    			}
    			
    			if(j==arr.length-1) {
    				i++;
    				
    				if(i<arr.length-2) {
    					j=i+1;
    				}
    				if(j<arr.length-1) {
    					k=j+1;
    				}
    			}
    			
    			if(i==arr.length-2 && j==arr.length-1 && k==arr.length) {
    				break;
    			}
    			
    			
    			if((arr[i]+arr[j]+arr[k])==num) {
    				count++;
    			}
    			k++;
    		}
    		
    		return count;
    }
}   
}    

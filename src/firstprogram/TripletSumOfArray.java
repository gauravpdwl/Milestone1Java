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
    		
    		
    		int count=0;
    		
    		for(int i=0;i<arr.length;i++) {
    			arr[i]=num-arr[i];
    		}
    		
    		Arrays.sort(arr);
    		
    		for(int i=0;i<arr.length;i++) {
    			int localCount=0;
    			int pairno=arr[i];
    			localCount=pairSum(arr, i+1, pairno);
    			count=count+localCount;
    		}
    		
    		return count;
    	}
    	
    	public static int pairSum(int []arr, int start, int num) {
    		
    		
    		
    		return 1;
    	}
    }
}

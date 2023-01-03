package firstprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindUniqueinArray {

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
            System.out.println(Solution.findUnique(arr));

            t -= 1;
        }
    }
    
    public class Solution {

    	public static int findUnique(int[] arr) {
    		//Your code goes here
    		int unique=0;
    		int n=arr.length;
    	    for(int i=1;i<n;i++){
    	        //Insert ith element in sorted position
    	        int j=i-1;
    	        int temp=arr[i];
    	        while(j>=0 && arr[j]>temp){
    	            arr[j+1]=arr[j];
    	            j--;
    	        }
    	        //Position will be j+1;
    	        arr[j+1]=temp;
    	        
    	       
    	    }
    		
    		for(int i=0;i<arr.length-1;) {
   
    				if(arr[i]==arr[i+1]) {
    					i=i+2;
    				}else {
    					unique=arr[i];
    					i++;
    					return unique;
    				}
    		}
    		
    		return arr[arr.length-1];
    	}
    }
}

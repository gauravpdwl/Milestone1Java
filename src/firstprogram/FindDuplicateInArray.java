package firstprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDuplicateInArray {

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

    		int[] input = takeInput();
        	System.out.println(Solution.findDuplicate(input));

        	t -= 1;
    	}
    }
    
    public class Solution {

    	public static int findDuplicate(int[] arr) {
    		//Your code goes here
    		//Insertion sort code start 
    		int j=0;
    		int temp=0;
    		
    		for(int i=1;i<arr.length;i++) {
    			temp=arr[i];
    			j=i-1;
    			while(j>=0 && arr[j]>temp) {
    				arr[j+1]=arr[j];
    				j--;
    			}
    			arr[j+1]=temp;
    		}
    		//Insertion sort code end
    		
			
//			  for(int i=0;i<arr.length;i++) { 
//				  System.out.println(arr[i]); 
//			  }
			 
    		
    		int duplicate=0;
    		for(int i=0;i<arr.length-1;i++) {
    			if(arr[i]==arr[i+1]) {
    				duplicate=arr[i];
    			}
    		}
    		  return duplicate;
    	}
    }
}



























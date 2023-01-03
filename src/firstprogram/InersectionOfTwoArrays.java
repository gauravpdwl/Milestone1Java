package firstprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InersectionOfTwoArrays {

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
            int[] arr1 = takeInput();
            int[] arr2 = takeInput();
            Solution.intersection(arr1, arr2);
            System.out.println();

            t -= 1;
        }
    }
    
    public class Solution {

    	public static void intersection(int[] arr1, int[] arr2) {
    	    //Your code goes here
    		int min=0;
    		int minloc=0;
    		int temp;
    		for(int i=0;i<arr1.length-1;i++) {
    			min=arr1[i];
    			for(int j=i;j<arr1.length;j++) {
    				if(min>arr1[j]) {
    					min=arr1[j];
    					minloc=j;
    				}
    			}
    			if(min!=arr1[i]) {
    				temp = arr1[i];
    				arr1[i] = arr1[minloc];
    				arr1[minloc] = temp;
    			}
    		}
    		
 /*   		for(int i=0;i<arr1.length;i++) {
    			System.out.println(arr1[i]);
    		}*/
    		
    		for(int i=0;i<arr1.length;i++) {
    			for(int j=0;j<arr2.length;j++) {
    				if(arr1[i]==arr2[j]) {
    					System.out.print(arr1[i]+" ");
    					arr2[j]=-1;
    					break;
    				}
    			}
    		}
    	}

    }
}



























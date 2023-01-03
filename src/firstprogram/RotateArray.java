package firstprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateArray {

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
            int d = Integer.parseInt(br.readLine().trim());
            Solution.rotate(input, d);
            printArray(input);

            t -= 1;
        }
    }
    
    public class Solution {  

        public static void rotate(int[] arr, int d) {
        	//Your code goes here
        	
//        	int temp;
//        	for(int i=0;i<d;i++) {
//        		temp=arr[0];
//        		for(int j=0;j<arr.length-1;j++) {
//        			arr[j]=arr[j+1];
//        		}
//        		arr[arr.length-1]=temp;
//        	}
        	
//        	int i=0;
//        	int arraylength=arr.length;
//        	while(i<d) {
//        		int j=0;
//        		int temp=arr[0];
//        		while(j<arraylength-1) {
//        			arr[j]=arr[j+1];
//        			j++;
//        		}
//        		arr[arraylength-1]=temp;
//        		i++;
//        	}
        	
        	int temp;
        	int i=0;
        	int j=0;
        	
        	int a[]=new int[d];
        	while(i<arr.length) {
        		if(i<d) {
        			a[i]=arr[i];
        		}
        		
        		if(i<(arr.length)-d) {
        			arr[i]=arr[i+d];
        		}
        		
        		
        		if(i>=arr.length-d && j<d) {
        			arr[i]=a[j];
        			j++;
        		}
        		i++;
        	}
        	
        	
        }

    } 
}























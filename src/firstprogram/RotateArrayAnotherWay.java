package firstprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateArrayAnotherWay {

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
//        	int i=0;
//        	while(i<d) {
//        		int temp=arr[0];
//        		for(int j=0;j<arr.length-1;j++) {
//        			arr[j]=arr[j+1];
//        		}
//        		arr[arr.length-1]=temp;
//        		i++;
//        	}
        	
        	int a[]=new int[d];
        	for(int i=0;i<d;i++) {
        		a[i]=arr[i];
        	}
        	
        	for(int i=0;i<arr.length-d;i++) {
        		arr[i]=arr[i+d];
        	}
        	
        	int j=0;
        	for(int i=arr.length-d;i<arr.length;i++) {
        		arr[i]=a[j];
        		j++;
        	}
            
        }

    }
}
























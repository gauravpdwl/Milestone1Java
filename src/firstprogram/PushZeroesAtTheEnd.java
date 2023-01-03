package firstprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PushZeroesAtTheEnd {

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
            Solution.pushZerosAtEnd(input);
            printArray(input);
            
            t -= 1;
        }
    }
    
    public class Solution {  

        public static void pushZerosAtEnd(int[] arr) {
        	//Your code goes here
            int count0=0;
            int j=0;
            for(int i=0;i<arr.length;i++) {
            	if(arr[i]==0) {
            		count0++;
            	}else {
            		arr[j]=arr[i];
            		j++;
            	}
            }
            
            while(count0>0) {
            	arr[j]=0;
            	j++;
            	count0--;
            }
           
        }

    }
}

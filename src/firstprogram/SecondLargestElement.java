package firstprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondLargestElement {

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
            int ans = Solution.secondLargestElement(input);
            System.out.println(ans);

            t -= 1;
        }
    }
    
    public class Solution {  

        public static int secondLargestElement(int[] arr) {
        	//Your code goes here
        	
        	int largest=-2147483648;
        	int slargest=-2147483648;
        	
        	if(arr.length<=1) {
        		return slargest;
        	}
        	
        	for(int i=0;i<arr.length;i++) {
        		
        		if(arr[i]>largest) {
        			slargest=largest;
        			largest=arr[i];
        		}else {
        			if(arr[i]>slargest && arr[i]!=largest) {
        				slargest=arr[i];
        			}
        		}
        		
        	}
        	
        	return slargest;
        }

    }
}

















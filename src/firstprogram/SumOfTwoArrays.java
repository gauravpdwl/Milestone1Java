package firstprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfTwoArrays {

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

            int[] output = new int[1 + Math.max(arr1.length, arr2.length)];

            Solution.sumOfTwoArrays(arr1, arr2, output);
            printArray(output);

            t -= 1;
        }
    }
    
    public class Solution {

        public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        	//Your code goes here
        	int sum=0;
        	int carry=0;
        	int rem = 0;
        	int a1=arr1.length-1;
        	int a2=arr2.length-1;
        	
        	for(int i=output.length-1;i>=0;i--) {
        		
        		if(a1>=0 && a2<0) {
        			sum=arr1[a1]+carry;
        			carry=sum/10;
        			rem=sum%10;
        			a1--;
        		}
        		
        		if(a2>=0 && a1<0) {
        			sum=arr2[a2]+carry;
        			carry=sum/10;
        			rem=sum%10;
        			a2--;
        		}
        		
        		if(a1>=0 && a2>=0) {
        			sum=arr1[a1]+arr2[a2]+carry;
//        			System.out.println("arr1 "+arr1[a1]+"arr2 "+arr2[a2]);
        			carry=sum/10;
        			rem=sum%10;
        			a1--;
        			a2--;
        		}
        		
        		output[i]=rem;
        		
//        		System.out.println("Sum "+sum);
//        		System.out.println("Rem "+rem);
//        		System.out.println("Carry "+carry);
        		
        		if(a1<0 && a2<0) {
        			output[0]=carry;
        		}
        	}
        	
        }//sum of two arrays

    }
}



































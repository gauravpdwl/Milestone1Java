package firstprogram;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayOutputEvenOddPattern {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    public static void arrange(int[] arr, int n) {
    	//Your code goes here

        int firstpart=(n+1)/2;
        int secondpart=firstpart;
        int firstno=1;
        int lastno;
        if(n%2==0){
            lastno=2*secondpart;
        }else{
            lastno=2*(secondpart-1);  
        }

        for(int i=0;i<firstpart;i++){
            arr[i]=firstno;
            firstno=firstno+2;
        }

        for(int i=secondpart;i<n;i++){
            arr[i]=lastno;
            lastno=lastno-2;
        }

    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            arrange(arr, n);
            printArray(arr);

            t -= 1;
        }
    }
}

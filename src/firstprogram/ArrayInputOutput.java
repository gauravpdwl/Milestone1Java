package firstprogram;

import java.util.Scanner;

public class ArrayInputOutput {

	public static int[] inputArray(int size) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[size];
		System.out.println("Enter array elements below:");
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public static void displayArray(int array[]) {
		System.out.println("Your array is:");
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}
		
	}
	
	public static void mutateArray(int array[]) {
		System.out.println("Your mutated array is:");
		for(int i=0;i<array.length;i++) {
			array[i]=array[i]*2;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of your Array:");
		int size=sc.nextInt();
		int array[]=inputArray(size);
		displayArray(array);
		mutateArray(array);
		displayArray(array);
	}


}



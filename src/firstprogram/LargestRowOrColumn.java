package firstprogram;

import java.util.Scanner;

public class LargestRowOrColumn {

	public static void  fun(int[][] arr2d)
	{
		Scanner sc=new Scanner(System.in);
	    for(int i=0;i<arr2d.length;i++)
	    {
	        for(int j=0;j<arr2d[i].length;j++)
	        {
	            arr2d[i][j]=sc.nextInt();
	        }
	    }
	}
	
	public static void displayArray(int arr[][]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Your 2d array is:");
		
		int rows=arr.length;
		int cols=arr[0].length;
		
		for(int i=0;i<rows;i++)
	    {
	        for(int j=0;j<cols;j++)
	        {
	            System.out.print(arr[i][j]+" ");
	        }
	        System.out.println();
	    }
		
	}
	
	public static void maxColumn(int arr[][]) {
		
		//System.out.println("Max column/row sum is:");
		
		int rows=arr.length;
		if(rows==0){
			//System.out.println("row "+0+" "+(-2147483648));
			System.out.println("row 0 -2147483648");
			return;
		}
		int cols=arr[0].length;
		int maxcolsum=0;
		int maxrowsum=0;
		int rowno = 0;
		int colno = 0;
		
		for(int j=0;j<cols;j++)
	    {	
			int sum=0;
	        for(int i=0;i<rows;i++)
	        {
	            sum=sum+arr[i][j];
	        }
	        if(sum>maxcolsum) {
	        	maxcolsum=sum;
	        	colno=j;
	        }
	    }
		
		for(int i=0;i<rows;i++)
	    {	
			int sum=0;
	        for(int j=0;j<cols;j++)
	        {
	            sum=sum+arr[i][j];
	        }
	        if(sum>maxrowsum) {
	        	maxrowsum=sum;
	        	rowno=i;
	        }
	    }
		
		if(maxrowsum>=maxcolsum) {
			System.out.println("row "+rowno+" "+maxrowsum);
		}else {
			System.out.println("column "+colno+" "+maxcolsum);
		}
		
		
	}
	
	public static void main(String[] args) 
	{ 
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Array Size:");
	    int r=sc.nextInt();
	    int c=sc.nextInt();
	    
	    int arr[][]=new int[r][c];
	    
	    fun(arr);//To accept 2D array
	    displayArray(arr);
	    maxColumn(arr);
	} 
	
}























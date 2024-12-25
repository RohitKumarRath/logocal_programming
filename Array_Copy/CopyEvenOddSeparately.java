package com.rohit.Array_Copy;

import java.util.Scanner;

public class CopyEvenOddSeparately 
{
	public static final Scanner sc = new Scanner(System.in);
    public static int[] createArray() 
    {
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        if (size <= 0) 
        {
            throw new IllegalArgumentException("Array size must be greater than 0.");
        }
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] arr) 
    {
    	System.out.print("\nThe given array is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
    }
    public static void copyEvenOddSeparately(int[] arr)
    {
    	int evenCount=0,oddCount=0;
    	for(int ele:arr)
    	{
    		if(ele%2==0)
    		{
    			evenCount++;
    		}
    		else oddCount++;
    	}
    	int[] odd=new int[oddCount];
    	int[] even=new int[evenCount];
    	int oddIndex=0,evenIndex=0;
    	for(int ele:arr)
    	{
    		if(ele%2==0)
    		{
    			even[evenIndex++]=ele;
    		}
    		else odd[oddIndex++]=ele;
    	}
    	
    	System.out.print("\nEven Element array: ");
    	for(int i=0;i<even.length;i++)
    	{
    		System.out.print(even[i]+" ");
    	}
    	System.out.print("\nOdd Element array: ");
    	for(int i=0;i<odd.length;i++)
    	{
    		System.out.print(odd[i]+" ");
    	}
    }
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		printArray(arr);
		copyEvenOddSeparately(arr);
	}
}
package com.rohit.Array_Swapping;

import java.util.Scanner;

public class SwapppingMaximumAndMinimum 
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
    public static void swapMaxAndMin(int[] arr)
    {
    	System.out.println("\nAfter Swapping the Mximum and Minimum element: ");
    	int maxIndex=0,minIndex=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]>arr[maxIndex])
    		{
    			maxIndex=i;
    		}
    		if(arr[i]<arr[minIndex])
    		{
    			minIndex=i;
    		}
    	}
    	int temp=arr[maxIndex];
    	arr[maxIndex]=arr[minIndex];
    	arr[minIndex]=temp;
    }
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		printArray(arr);
		swapMaxAndMin(arr);
		printArray(arr);
	}
}
package com.rohit.Array_Swapping;

import java.util.Scanner;

public class SwappingElementInPairs 
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
    public static void swapElementsInPairs(int[] arr)
    {
    	System.out.println("\nAfter Swapping elements in Pair: ");
    	for(int i=0;i<arr.length-1;i+=2)
    	{
    		int temp=arr[i];
    		arr[i]=arr[i+1];
    		arr[i+1]=temp;
    	}
    }
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		printArray(arr);
		swapElementsInPairs(arr);
		printArray(arr);
	}
}
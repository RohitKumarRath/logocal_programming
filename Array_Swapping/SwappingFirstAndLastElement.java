package com.rohit.Array_Swapping;

import java.util.Scanner;

public class SwappingFirstAndLastElement 
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
    public static void swapFirstAndLast(int[] arr)
    {
    	System.out.println("\nAfter Swapping First and Last element: ");
    	int temp=arr[0];
    	arr[0]=arr[arr.length-1];
    	arr[arr.length-1]=temp;
    }
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		printArray(arr);
		swapFirstAndLast(arr);
		printArray(arr);
	}
}
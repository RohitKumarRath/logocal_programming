package com.rohit.Array_Replacing_Swapping;

import java.util.Scanner;

public class ReplaceNegativeNumbersWithZero 
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
    public static void replaceNegativeNumbersWithZero(int[] arr)
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]<0)
    		{
    			arr[i]=0;
    		}
    	}
    	System.out.print("\nThe new Replaced array is: ");
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.print(arr[i]+" ");
    	}
    }
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		printArray(arr);
		replaceNegativeNumbersWithZero(arr);
	}
}
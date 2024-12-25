package com.rohit.Array_Copy;

import java.util.Scanner;

public class CopyUsingIndexRange 
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
    public static void copyRange(int[] arr,int start,int end)
    {
    	int newLength=end-start;
    	if(newLength<0)
    	{
    		throw new IllegalArgumentException(start+" > "+end);
    	}
    	int[] copy=new int[newLength];
    	int index=0;
    	for(int i=start;i<end;i++)
    	{
    		copy[index++]=arr[i];
    	}
    	System.out.print("Copied array is: ");
    	for(int i=0;i<copy.length;i++)
    	{
    		System.out.print(copy[i]+" ");
    	}
    }
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		printArray(arr);
		System.out.println("\nEnter the starting index: ");
		int start=sc.nextInt();
		System.out.println("Enter the ending index: ");
		int end=sc.nextInt();
		copyRange(arr, start, end);
	}
}
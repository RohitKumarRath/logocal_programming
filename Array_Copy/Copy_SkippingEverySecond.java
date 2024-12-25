package com.rohit.Array_Copy;

import java.util.Scanner;

public class Copy_SkippingEverySecond 
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
    public static void skippingEverySecondElement(int[] arr)
    {
    	int newsize=(arr.length+1)/2;
    	int[] result=new int[newsize];
    	int index=0;
    	for(int i=0;i<arr.length;i+=2)
    	{
    		result[index++]=arr[i];
    	}
    	System.out.print("\nResulting Array: ");
    	for(int i=0;i<result.length;i++)
    	{
    		System.out.print(result[i]+" ");
    	}
    }
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		printArray(arr);
		skippingEverySecondElement(arr);
	}
}
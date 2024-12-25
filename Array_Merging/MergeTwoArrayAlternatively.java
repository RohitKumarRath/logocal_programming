package com.rohit.Array_Merging;

import java.util.Scanner;

public class MergeTwoArrayAlternatively 
{
	public static final Scanner sc = new Scanner(System.in);
    public static int[] createArray() 
    {
        System.out.println("\nEnter the size of the array: ");
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
    public static int[] mergeAlternatively(int[] arr1,int[] arr2)
    {
    	int maxLength=Math.max(arr1.length,arr2.length);
    	int[] result=new int[arr1.length+arr2.length];
    	int index=0;
    	for(int i=0;i<maxLength;i++)
    	{
    		if(i<arr1.length)
    		{
    			result[index++]=arr1[i];
    		}
    		if(i<arr2.length)
    		{
    			result[index++]=arr2[i];
    		}
    	}
    	System.out.println("\nNew Merged array is: ");
    	return result;
    }
	public static void main(String[] args) 
	{
		int[] arr1=createArray();
		printArray(arr1);
		int[] arr2=createArray();
		printArray(arr2);
		int[] mergeAlternatively = mergeAlternatively(arr1, arr2);
		printArray(mergeAlternatively);
	}
}
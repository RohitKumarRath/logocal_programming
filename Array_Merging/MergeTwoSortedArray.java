package com.rohit.Array_Merging;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray 
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
    public static int[] mergeTwoArray(int[] arr1,int[] arr2)
    {
    	Arrays.sort(arr1);
    	Arrays.sort(arr2);
    	int newLength=arr1.length+arr2.length;
    	int[] result=new int[newLength];
    	int index=0;
    	for(int a:arr1)
    	{
    		result[index++]=a;
    	}
    	for(int b:arr2)
    	{
    		result[index++]=b;
    	}
    	System.out.print("\nNew Sorted Merged Array is: ");
    	Arrays.sort(result);
    	return result;
    }
	public static void main(String[] args) 
	{
		int[] arr1=createArray();
		printArray(arr1);
		int[] arr2=createArray();
		printArray(arr2);
		int[] mergeTwoArray = mergeTwoArray(arr1, arr2);
		printArray(mergeTwoArray);
	}
}
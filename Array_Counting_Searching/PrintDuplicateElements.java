package com.rohit.Array_Counting_Searching;

import java.util.Scanner;

public class PrintDuplicateElements 
{
	public static final Scanner sc=new Scanner(System.in);
	public static int[] createArray()
	{
		System.out.println("Enter the size of the array: ");
		int size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void printArray(int[] arr)
	{
		System.out.print("Given array elements are: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void duplicateElement(int[] arr)
	{
		System.out.print("\nDuplicate elements present in the array are: ");
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		printArray(arr);
		duplicateElement(arr);
	}
}
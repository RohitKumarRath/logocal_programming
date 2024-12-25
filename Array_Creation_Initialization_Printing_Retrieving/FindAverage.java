package com.rohit.Array_Creation_Initialization_Printing_Retrieving;

import java.util.Scanner;

public class FindAverage 
{
	public static final Scanner sc = new Scanner(System.in);
	public static int[] createArray()
	{
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter "+size+" elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void printArray(int[] arr)
	{
		System.out.print("User taken array is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void findAverage(int[] arr)
	{
		int sumArr=0,avgArr=0;
		for(int i=0;i<arr.length;i++)
		{
			sumArr+=arr[i];
		}
		avgArr=sumArr/arr.length;
		System.out.println("\nAverage of array elements: "+avgArr);
	}
	public static void main(String[] args) 
	{
		int[] array = createArray();
		printArray(array);
		findAverage(array);
	}
}
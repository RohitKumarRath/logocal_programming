package com.rohit.Array_Counting_Searching;

import java.util.Scanner;

public class FindMedian 
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
	public static double getMedian(int[] arr)
	{
		int median=arr.length;
		if(median%2==0)
		{
			return (arr[median/2-1]+arr[median/2])/2.0;
		}
		else
		{
			return arr[median/2];
		}
	}
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		printArray(arr);
		double median=getMedian(arr);
		System.out.println("\nMedian is: "+median);
	}
}
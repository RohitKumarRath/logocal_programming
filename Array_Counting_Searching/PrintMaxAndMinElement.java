package com.rohit.Array_Counting_Searching;

import java.util.Scanner;

public class PrintMaxAndMinElement 
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
	public static int findMax(int[] arr)
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static int findMin(int[] arr)
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		printArray(arr);
		int max = findMax(arr);
		int min = findMin(arr);
		System.out.println("\nMax element is: "+max);
		System.out.println("Min element is: "+min);
	}
}
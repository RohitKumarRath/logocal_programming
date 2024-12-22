package com.rohit.Creation_Initialization_Printing_Retrieving;

import java.util.Scanner;

public class MiddleElement 
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
	public static void middleElement(int[] arr)
	{
		int length = arr.length;
		if(length % 2 == 0)
		{
			System.out.println("\nMiddle elements :"+arr[length / 2 - 1]+" "+arr[length / 2]);
		}
		else
		{
			System.out.println("\nMiddle element : "+arr[length/2]);
		}
	}
	public static void main(String[] args) 
	{
		int[] array = createArray();
		printArray(array);
		middleElement(array);
	}
}
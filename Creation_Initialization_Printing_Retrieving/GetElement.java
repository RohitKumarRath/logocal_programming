package com.rohit.Creation_Initialization_Printing_Retrieving;

import java.util.Scanner;

public class GetElement 
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
	public static void getElements(int[] arr, int index) {
		if (index < 0 || index >= arr.length) {
			throw new IndexOutOfBoundsException(index + " is out of range...");
		}
		System.out.println("\n"+arr[index]+" Present at index: "+index);
	}
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		System.out.println("Enter the index position: ");
		int index = sc.nextInt();
		printArray(arr);
		getElements(arr, index);
	}
}
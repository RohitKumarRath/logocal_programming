package com.rohit.Creation_Initialization_Printing_Retrieving;

import java.util.Scanner;

public class FindSum 
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
	public static void findSum(int[] arr) {
		int sum = 0;
		for (int x : arr) {
			sum += x;
		}
		System.out.print("\nSum of all elements is : " + sum);
	}
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		printArray(arr);
		findSum(arr);
	}
}
package com.rohit.Array_Creation_Initialization_Printing_Retrieving;

import java.util.Scanner;

public class EvenAndOddElement 
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
	public static void printEvenAndOddEle(int[] arr) 
	{
		System.out.print("\nEven elements are : ");
		for (int x : arr) {
			if (x % 2 == 0) {
				System.out.print(x + " ");
			}
		}
		System.out.println();
		System.out.print("Odd elements are : ");
		for (int x : arr) {
			if (x % 2 != 0) {
				System.out.print(x + " ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		printArray(arr);
		printEvenAndOddEle(arr);
	}
}
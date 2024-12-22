package com.rohit.Array_Counting;

import java.util.Scanner;

public class EvenOddCount 
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
	public static void countEvenOdd(int[] arr)
	{
		int evenCount=0,oddCount=0;
		for(int i:arr)
		{
			if(i%2==0)
			{
				evenCount++;
			}
			else oddCount++;
		}
		System.out.println("\n"+evenCount+" number of even elements are present.");
		System.out.println("\n"+oddCount+" number of odd elements are present.");
	}
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		printArray(arr);
		countEvenOdd(arr);
	}
}
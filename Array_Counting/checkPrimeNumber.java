package com.rohit.Array_Counting;

import java.util.Scanner;

public class checkPrimeNumber 
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
	public static int isPrime(int n)
	{
		int count=0;
		if(n<=1)
		{
			return -1;
		}
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	public static void checkPrime(int[] arr)
	{
		boolean found=false;
		System.out.print("\nPrime numbers in the array are: ");
		for(int ele:arr)
		{
			if(isPrime(ele)==1)
			{
				System.out.print(ele+" ");
				found=true;
			}
		}
		if(!found)
		{
			System.out.println("No Prime number found.");
		}
	}
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		printArray(arr);
		checkPrime(arr);
	}
}
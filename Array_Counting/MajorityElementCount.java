package com.rohit.Array_Counting;

import java.util.Scanner;

public class MajorityElementCount //elements that are appearing more than half of the length i.e(n/2)
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
	public static int majorityElement(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>arr.length/2)
			{
				System.out.print(arr[i]);
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		printArray(arr);
		int result = majorityElement(arr);
		if(result!=-1)
		{
			System.out.println("\nMajority element is: "+result);
		}
		else
		{
			System.out.println("\nNo such element is present.");
		}
	}
}
package com.rohit.Array_Counting;

import java.util.Scanner;

public class CountElementsExactKTimes 
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
	public static void countElements(int[] arr,int k)
	{
		boolean[] visited =new boolean[arr.length];
		boolean found=false;
		System.out.println("\nElements appearing exactly "+k+" times is: ");
		for(int i=0;i<arr.length;i++)
		{
			if(!visited[i])
			{
				int count=1;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						visited[j]=true;
					}
				}
				if (count == k) 
				{
					System.out.print(arr[i] + " ");
					found = true;
				}
			}
		}
		if(!found)
		{
			System.out.println("No such element found.");
		}
	}
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		System.out.println("Enter the value of K: ");
		int k = sc.nextInt();
		printArray(arr);
		countElements(arr, k);
	}
}
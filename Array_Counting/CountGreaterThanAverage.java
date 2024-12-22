package com.rohit.Array_Counting;

import java.util.Scanner;

public class CountGreaterThanAverage 
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
	public static void greaterThanAvg(int[] arr)
	{
		int count=0;
		int sum=0,avg=0;
		for(int ele : arr)
		{
			sum+=ele;
		}
		avg=sum/arr.length;
		for(int ele:arr)
		{
			if(ele>avg)
			{
				count++;
			}
		}
		System.out.println("\n"+count+" number of elements are greater than Average.");
	}
	
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		printArray(arr);
		greaterThanAvg(arr);
	}
}
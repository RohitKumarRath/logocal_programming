package com.rohit.Array_Counting_Searching;

import java.util.Scanner;

public class SearchElement 
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
	public static int searchElement(int[] arr,int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		printArray(arr);
		System.out.println("\nEnter the element: ");
		int element=sc.nextInt();
		int result=searchElement(arr, element);
		if(result!=-1)
		{
			System.out.println("Element is found at index: "+result);
		}
		else
		{
			System.out.println("Element not fount");
		}
	}
}
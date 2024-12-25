package com.rohit.Array_Counting_Searching;

import java.util.Scanner;

public class SearchElement_Binary_search 
{
	public static final Scanner sc = new Scanner(System.in);
	public static int[] createArray()
	{
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr=new int[size];
		if (size <= 0) 
        {
            throw new IllegalArgumentException("Array size must be greater than 0.");
        }
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void printArray(int[] arr)
	{
		System.out.print("\nThe given array is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static int binarySearch(int[] arr,int key)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			int midEle = arr[mid];
			if(key==midEle)
			{
				return mid;
			}
			else if(key>midEle)
			{
				start=mid+1;
			}
			else end=mid-1;
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		printArray(arr);
		System.out.println("\nEnter the element you want to search: ");
		int key = sc.nextInt();
		int index=binarySearch(arr, key);
		if(index!=-1)
		{
			System.out.println("Element found at index: "+index);
		}
		else
		{
			System.out.println("Element Not Found");
		}
	}
}
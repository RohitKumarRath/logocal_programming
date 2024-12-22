package com.rohit.Creation_Initialization_Printing_Retrieving;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandomElements 
{
	public static final Scanner sc = new Scanner(System.in);
	public static int[] createArray()
	{
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr=new int[size];
		Random r = new Random();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=r.nextInt(1, 100);
		}
		return arr;
	}
	public static void printArray(int[] arr)
	{
		System.out.print("Randomly generated arrays are: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int[] array = createArray();
		printArray(array);
	}
}
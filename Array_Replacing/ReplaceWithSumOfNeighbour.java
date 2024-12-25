package com.rohit.Array_Replacing_Swapping;

import java.util.Scanner;

public class ReplaceWithSumOfNeighbour 
{
	public static final Scanner sc = new Scanner(System.in);
    public static int[] createArray() 
    {
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        if (size <= 0) 
        {
            throw new IllegalArgumentException("Array size must be greater than 0.");
        }
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
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
    public static void replaceSumOfNeighbour(int[] arr)
    {
    	int[] result=new int[arr.length];
    	for(int i=0;i<arr.length;i++)
    	{
    		if(i==0)
    		{
    			result[i]=arr[i+1];
    		}
    		else if(i==arr.length-1)
    		{
    			result[i]=arr[i-1];
    		}
    		else result[i]=arr[i+1]+arr[i-1];
    	}
    	System.out.print("\nThe New Array is: ");
    	for(int i=0;i<result.length;i++)
    	{
    		System.out.print(result[i]+" ");
    	}
    }
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		printArray(arr);
		replaceSumOfNeighbour(arr);
	}
}
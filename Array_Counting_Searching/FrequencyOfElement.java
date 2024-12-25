package com.rohit.Array_Counting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfElement 
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
    
//    Counting and replacing the duplicate with a special character/or 
//    less than min number /less than max number.
//    public static void frequencyOfElement(int[] arr)
//    {
//    	for(int i=0;i<arr.length;i++)
//    	{
//    		int count=1;
//    		for(int j=i+1;j<arr.length;j++)
//    		{
//    			if(arr[i]==arr[j] && arr[i]!='*')
//    			{
//    				count++;
//    				arr[j]='*';
//    			}
//    		}
//    		if(arr[i]!='*')
//    		{
//    			System.out.println("\n"+arr[i]+" presents "+count+" times.");
//    		}
//    	}
//    }
    
//    > Without replacing the duplicate by using another new array.
//     public static void frequencyOfElement(int[] arr)
//     {
//    	boolean[] bool=new boolean[arr.length];
//    	for(int i=0;i<arr.length;i++)
//    	{
//    		int count=1;
//    		for(int j=i+1;j<arr.length;j++)
//    		{
//    			if(arr[i]==arr[j] && bool[i]!=true)
//    			{
//    				count++;
//    				bool[j]=true;
//    			}
//    		}
//    		if(bool[i]!=true)
//    		{
//    			System.out.println("\n"+arr[i]+" presents "+count+" times.");
//    		}
//    	}
//     }
    
    
//	  > Without replacing duplicate and without creating a new array.    
//    public static void frequencyOfElement(int[] arr)
//    {
//    	Arrays.sort(arr);
//    	System.out.println("\nFrequency: ");
//    	for(int i=0;i<arr.length;i++)
//    	{
//    		int count=1,found=0;
//    		for(int j=0;j<arr.length;j++)
//    		{
//    			if(arr[i]==arr[j] && i<j)
//        		{
//        			count++;
//        		}
//        		if(arr[i]==arr[j] && i>j)
//        		{
//        			found++;break;
//        		}
//    		}
//    		if(found==0)
//    		{
//    			System.out.println("\n"+arr[i]+" presents "+count+" times.");
//    		}
//    	}
//    }
    
//    > By sorting and using one for loop.
    public static void frequencyOfElement(int[] arr)
    {
    	Arrays.sort(arr);
    	int count=1;
    	for(int i=0;i<arr.length-1;i++)
    	{
    		if(arr[i]==arr[i+1])
    		{
    			count++;
    		}
    		else
    		{
    			System.out.println("\n"+arr[i]+" presents "+count+" times.");
    			count=1;
    		}
    		if(i+1==arr.length-1)
    		{
    			System.out.println("\n"+arr[i]+" presents "+count+" times.");
    		}
    	}
    }
    
    
	public static void main(String[] args) 
	{
		int[] arr=createArray();
		printArray(arr);
		frequencyOfElement(arr);
		printArray(arr);
	}
}
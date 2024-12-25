package com.rohit.Array_Copy;

import java.util.Scanner;

public class CopyCommonElements 
{
	public static final Scanner sc = new Scanner(System.in);
    public static int[] createArray() 
    {
        System.out.println("\nEnter the size of the array: ");
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
	public static void copyCommonElement(int[]arr1,int[] arr2)
	{
		int[] common=new int[arr1.length];
		int index=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					boolean alreadyAdded=false;
					for(int k=0;k<index;k++)
					{
						if(common[k]==arr1[i])
						{
							alreadyAdded=true;
							break;
						}
					}
					if(!alreadyAdded)
					{
						common[index++]=arr1[i];
					}
					break;
				}
			}
		}
		int[] result=new int[index];
		for(int i=0;i<index;i++)
		{
			result[i]=common[i];
		}
		System.out.print("\nCopied array with common element is: ");
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int[] arr1= createArray();
		printArray(arr1);
		int[] arr2= createArray();
		printArray(arr2);
		copyCommonElement(arr1, arr2);
	}
}
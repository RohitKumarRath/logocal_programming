package com.rohit.Array_Counting_Searching;

import java.util.Scanner;

public class searching_by_given_index 
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
    public static int binarySearchByIndex(int[] arr, int key, int start, int end) 
    {
        verifyIndex(arr, start, end);
        int starting_index = start;
        int ending_index = end;
        while (starting_index <= ending_index) 
        {
            int mid = (starting_index + ending_index) / 2;
            int midEle = arr[mid];
            if (key == midEle) 
            {
                return mid;
            } 
            else if (key > midEle) 
            {
                starting_index = mid + 1;
            } 
            else 
            {
                ending_index = mid - 1;
            }
        }
        return -1;
    }
    public static void verifyIndex(int[] arr, int start, int end) 
    {
        if (start < 0 || end >= arr.length || start > end) 
        {
            throw new ArrayIndexOutOfBoundsException("Invalid range: start=" + start + ", end=" + end);
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = createArray();
        printArray(arr);
        System.out.println("\n\nEnter starting index: ");
        int starting_index = sc.nextInt();
        System.out.println("Enter ending index: ");
        int ending_index = sc.nextInt();
        System.out.println("Enter the element you want to search: ");
        int ele = sc.nextInt();
        try 
        {
            int result = binarySearchByIndex(arr, ele, starting_index, ending_index);
            if (result != -1) 
            {
                System.out.println(ele + " is present at index " + result);
            } 
            else 
            {
                System.out.println(ele + " is not found in the specified range.");
            }
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
package com.dsa.array.search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[] inputArray = new int[n];

		for (int i =0 ; i<inputArray.length; i++)
		{
			inputArray[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(inputArray));
		
		int k = scan.nextInt();

		System.out.println("Element Found::"+binarySearch(inputArray,0,inputArray.length-1,k));
		System.out.println("Element Found::"+binarySearchUsingRecursion(inputArray,0,inputArray.length-1,k));

		scan.close();

	}

	/**
	 * Method to search for an element in a sorted array
	 * @param arr , input Array
	 * @param firstIndex, first Index of array or subarray.
	 * @param lastIndex , first Index of array or subarray.
	 * @param element , element to search for
	 * @return
	 */
	private static boolean binarySearch(int[] arr,int firstIndex, int lastIndex, int element)
	{
		int middle = (firstIndex+lastIndex)/2;
		boolean isFound = false;

		while(firstIndex<=lastIndex)
		{
			if(element==arr[middle])
			{
				isFound =true;
				break;
			}
			else if (element<arr[middle]) 
			{
				lastIndex = middle-1;
			}
			else
			{
				firstIndex = middle+1;
			}

			middle=(firstIndex+lastIndex)/2;
		}

		if (firstIndex>lastIndex)
		{
			isFound =false;
		}

		return isFound;

	}



	/**
	 * Method to search for an element in a sorted array
	 * @param arr , input Array
	 * @param firstIndex, first Index of array or subarray.
	 * @param lastIndex , first Index of array or subarray.
	 * @param element , element to search for
	 * @return
	 */
	private static boolean binarySearchUsingRecursion(int[] arr,int firstIndex, int lastIndex, int element)
	{
		int middle = (firstIndex+lastIndex)/2;
		boolean isFound = false;
		if(firstIndex > lastIndex)
		{
			isFound = false;
			return isFound;
			
		}
		if(element==arr[middle])
		{
			isFound = true;
			return isFound;
		}
		if (element<arr[middle]) 
		{
			binarySearchUsingRecursion(arr,firstIndex,middle-1,element);
		}
		else
		{
			binarySearchUsingRecursion(arr,middle+1,lastIndex,element);
		}
		return isFound;

	}

}

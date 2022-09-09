package com.zohoGS.Tasks;

import java.util.Scanner;
import java.util.Arrays;

public class Array_OddEvenPositionSort {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the length of your array: ");
		int size = in.nextInt();

		int[] inputArray = new int[size]; 

		System.out.println("Enter the array elements: ");
		for(int i = 0; i < size; i++)
			inputArray[i] = in.nextInt();

		Arrays.sort(inputArray);
		int midIndex = 0;

		if(inputArray.length % 2 != 0)
			midIndex = inputArray.length/2;
		else
			midIndex = (inputArray.length/2)-1;

		int i = midIndex;
		int j = midIndex + 1;

		while(i >= 0) {
			System.out.print(inputArray[i--]+" ");
			if(j < inputArray.length)
				System.out.print(inputArray[j++]+" ");
		}

	}

}

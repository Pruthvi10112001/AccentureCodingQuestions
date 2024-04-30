package com.accenture.productSmallestPair;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sum");
		int sum= scan.nextInt();
		System.out.println("Enter the size of array");
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array contents");
		for(int i=0;i < size; i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println(ProductSmallestPair(sum,arr));
	}
	private static int ProductSmallestPair(int sum,int[] arr) {
		Arrays.sort(arr);
		int check=arr[0]+arr[1];
		if(check <= sum)
			return arr[0] * arr[1];
		else
			return 0;
	}
}

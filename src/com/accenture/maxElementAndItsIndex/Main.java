package com.accenture.maxElementAndItsIndex;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=scan.nextInt();
		int arr[]=new int[size];
		int max=arr[0],index=0;
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(arr[i]>max) {
				max=arr[i];
			    index=i;
			}
		}
		System.out.println("Maximum element is "+max);
		System.out.println("Index of maximum element is "+index);
	}
}

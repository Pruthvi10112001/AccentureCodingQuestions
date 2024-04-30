package com.accenture.absoluteDifferenceCount;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array contents");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter a number");
		int num=scan.nextInt();
		System.out.println("Enter the difference");
		int diff= scan.nextInt();
		System.out.println(findCount(arr, n, num, diff));
	}

	private static int findCount(int[] arr, int n, int num, int diff) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0; i<n; i++) {
			if(Math.abs(num - arr[i])<=diff)
				count++;
		}
		if(count > 0)
			return count;
		else
			return -1;
	}
}

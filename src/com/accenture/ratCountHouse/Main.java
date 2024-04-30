package com.accenture.ratCountHouse;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of rats in an area");
		int r=scan.nextInt();
		System.out.println("Enter the amount of food each rat consumes");
		int unit=scan.nextInt();
		System.out.println("Enter the size of an array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("The amount of food present in "+calculate(r, unit, arr, n)+" houses is sufficient for rats");
	}

	private static int calculate(int r, int unit, int[] arr, int n) {
		// TODO Auto-generated method stub
		if(arr==null)
			return 0;
		int res= r * unit;
		int sum=0;//sum of food aounts in houses
		int count=0;//count the number of houses checked
		for(int i=0; i<n; i++) {
			sum=sum+arr[i];
			count++;
			if(sum>=res)
				break;
		}
		if(sum < res) {
			return 0;//indicates that the food in all houses is not sufficient for the rats
		}
		return count;//number of houses with sufficient food for the rats
	}
}

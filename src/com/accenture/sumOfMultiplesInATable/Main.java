package com.accenture.sumOfMultiplesInATable;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		sumOfMultiples(num);
	}
	public static void sumOfMultiples(int num)
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			int res=i*num;
			sum=sum+res;
		}
		System.out.println("Sum of multiples of "+num+" is "+ sum);
	}
}

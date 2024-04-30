package com.accenture.divisibleBy3AND5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the minimum range");
		int m= scan.nextInt();
		System.out.println("Enter the maximum range");
		int n= scan.nextInt();
		System.out.println("Sum of numbers divisible by 3 and 5 between " + m + " and " + n + " is " + calculate(m,n));
	}
	public static int calculate(int m, int n) {
		int sum=0;
		for(int i=m; i<=n; i++)
		{
			if(i != 0 && i % 3 == 0 && i % 5 == 0)
			{
				sum = sum + i;
			}
		}
		return sum;
	}
}

package com.accenture.differenceOfNonMultiples;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of m");
		int m= scan.nextInt();
		System.out.println("Enter the value of n");
		int n= scan.nextInt();
		System.out.println(calc(n,m));
	}

	private static int calc(int n, int m) {
		// TODO Auto-generated method stub
		int sum1=0,sum2=0;
		for(int i=1;i<=m;i++)
		{
			if(i%n==0)
				sum1=sum1+i;
			else
				sum2=sum2+i;
		}
		return Math.abs(sum1-sum2);
	}
}

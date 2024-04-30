package com.accenture.noOfcarries;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = scan.nextInt();
		System.out.println(noOfCarries(num1,num2));
	}
	private static int noOfCarries(int num1, int num2) {
		int count=0;
		int temp1=num1;
		int temp2=num2;
		int rem=0;
		while(temp1!=0 && temp2!=0)
		{
			int d1=temp1%10;
			int d2=temp2%10;
			if((d1+d2+rem)>9)
			{
				count++;
				int sum=d1+d2+rem;
				sum=sum/10;
				rem=sum;
			}
			temp1=temp1/10;
			temp2=temp2/10;
		}
		return count;
	}
}

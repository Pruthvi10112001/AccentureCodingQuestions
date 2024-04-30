package com.accenture.maxExponents;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lowest range number");
		int num1 = scan.nextInt();
		System.out.println("Enter the highest range number");
		int num2 = scan.nextInt();
		System.out.println("Maximum Exponent "+maxexponent(num1,num2));
	}
	public static int maxexponent(int num1, int num2) {
		int max=0,num=0;
		for(int i=num1; i<=num2; i++)
		{
			int temp = count(i);
			if(temp > max)
			{
				max = temp;
				num = i;
			}
		}
		return num;
	}
	public static int count(int i)
	{
		int count=0;
		while(i%2==0 && i!=0)
		{
			count++;
			i = i / 2;
		}
		return count;
	}
}

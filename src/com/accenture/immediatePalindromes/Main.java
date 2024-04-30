package com.accenture.immediatePalindromes;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lower limit");
		int lower=scan.nextInt();
		System.out.println("Enter the upper limit");
		int upper=scan.nextInt();
		for(int i=lower;i<=upper;i++)
		{
			if(i==palindrome(i))
				System.out.println(i+" ");
		}
	}
	public static int palindrome(int i)
	{
		int rem=0;
		int div=i;
		while(div!=0)
		{
			int num=div%10;
			rem=(rem*10)+num;
			div=div/10;
		}
		return rem;
	}
}

package com.accenture.passwordChecker;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the password");
		String str=scan.next();
		int result=checkPassword(str);
		if(result==1)
			System.out.println("Valid password");
		if(result==0)
			System.out.println("Invalid password");
		//System.out.println(checkPassword(str));
	}

	private static int checkPassword(String str) {
		// TODO Auto-generated method stub
		int n=str.length();
		if(n>4)
			return 0;
		if(str.charAt(0)>='0' && str.charAt(0)<='9')
			return 0;
		int num=0;
		int cap=0;
		for(int i=0;i<=n-1;i++) {
			if(str.charAt(i)==' ' || str.charAt(i)=='/')
				return 0;
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
				num++;
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
				cap++;
		}
		if(num>0 && cap>0)
			return 1;
		else
			return 0;
	}
}

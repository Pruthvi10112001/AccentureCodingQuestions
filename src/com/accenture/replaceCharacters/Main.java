package com.accenture.replaceCharacters;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=scan.next();
		//char str[]=s1.toCharArray();
		//int n=str.length;
		System.out.println("Enter the first character");
		char ch1=scan.next().charAt(0);
		System.out.println("Enter the second character");
		char ch2=scan.next().charAt(0);
		replaceChar(s1, ch1, ch2);
	}
	public static void replaceChar(String s1, char ch1, char ch2) {
		String resString="";
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)==ch1)
				resString = resString + ch2;
			else if(s1.charAt(i)==ch2)
				resString = resString + ch1;
			else
				resString = resString + s1.charAt(i);
		}
		System.out.println(resString);
	}
}

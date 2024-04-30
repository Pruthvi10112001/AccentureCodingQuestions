package com.accenture.movehyphen;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string which includes hyphen/hyphens");
		String str = scan.next();
		System.out.println(moveHyphen(str));
	}
	public static String moveHyphen(String str) {
		String res="";
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='-')
				res= str.charAt(i)+ res;
			else 
				res = res+str.charAt(i);
		}
		return res;
	}
}

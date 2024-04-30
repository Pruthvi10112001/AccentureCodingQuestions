package com.accenture.binaryStringOperation;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scan.next();
		System.out.println(operationsBinaryString(str));
	}

	private static int operationsBinaryString(String str) {
		// TODO Auto-generated method stub
		if(str==null) {
			return -1;
		}
		int res=str.charAt(0)-'0';//0 is subtracted to convert it from a character digit to its integer value
		for(int i=1;i<str.length();)
		{
			char prev=str.charAt(i);
			i++;
			if(prev=='A')
				res=res & (str.charAt(i)-'0');
			else if(prev == 'B')
				res= res | (str.charAt(i)-'0');
			else
				res=res ^ (str.charAt(i)-'0');
			i++;
		}
		return res;
	}
}


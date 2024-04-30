package com.accenture.distanceBetweenPoints;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of x1");
		int x1=scan.nextInt();
		System.out.println("Enter the value of x2");
		int x2=scan.nextInt();
		System.out.println("Enter the value of x3");
		int x3=scan.nextInt();
		System.out.println("Enter the value of y1");
		int y1=scan.nextInt();
		System.out.println("Enter the value of y2");
		int y2=scan.nextInt();
		System.out.println("Enter the value of y3");
		int y3=scan.nextInt();
		int diff1=(int) Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1),2));
		int diff2=(int) Math.sqrt(Math.pow((x3-x2), 2) + Math.pow((y3-y2),2));
		int diff3=(int) Math.sqrt(Math.pow((x3-x1), 2) + Math.pow((y3-y1), 2));
		System.out.println(diff1+diff2+diff3);
	}
}

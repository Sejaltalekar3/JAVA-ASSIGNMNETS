package com.kodnest.math;

import java.util.Scanner;
public class Power {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int n=scan.nextInt();
	int cube=(int) Math.pow(n, 3);
   System.out.println("cube root of "+n+" is  " +cube);
}
}

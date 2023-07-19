package com.kodnest.math;
import java.util.Scanner;
public class MaxMinNumberFinder {//squareroot
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number n");
	int n=scan.nextInt();
	
	int squareroot= (int)Math.sqrt(n);
	System.out.println("the squareroot of a number is  : "+squareroot);
}
}

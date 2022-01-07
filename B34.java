package com.fundamental;

import java.util.Scanner;

public class B34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		double n1=sc.nextDouble();
		System.out.print("Enter number 2: ");
		double n2=sc.nextDouble();
		
		if(n1>0 && n1<1 && n2>0 && n2<1) {
			System.out.println("Both between 0 and 1");
		}else {
		System.out.println("false");
		}
	}

}

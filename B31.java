package com.fundamental;

import java.util.Scanner;

public class B31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int n1=sc.nextInt();
		System.out.println("Enter number 2: ");
		int n2=sc.nextInt();
		System.out.println("Enter number 3: ");
		int n3=sc.nextInt();
		
		if(n3==(n1+n2)) {
			System.out.println("True");
		}
		else {
			System.out.println("The n1 & n2 sum is != n3");
		}
		
	}	

}

package com.fundamental;

import java.util.Scanner;

public class B32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first number : ");
		int a = sc.nextInt();
		System.out.println("Input the second number : ");
		int b = sc.nextInt();
		System.out.println(common_digit(a, b));
		
	}
	
	public static boolean common_digit(int p, int q) {
		
		if((p>25 && p<75) && (q>25 && q<75)) {
			int x=p%10;
			int y=q%10;
			p/=10;
			q/=10;
			return(p==q || p==y || x==q || x==y);
		}
		return false;
	}
}

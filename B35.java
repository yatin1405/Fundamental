package com.fundamental;

import java.util.Scanner;

public class B35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input six non-negative number");
		int num = sc.nextInt();
		int n1 = num/100000%10;
		int n2 = num/10000%10;
		int n3 = num/1000%10;
		int n4 = num/100%10;
		int n5 = num/10%10;
		int n6 = num/1%10;
		System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6);
		
	}

}

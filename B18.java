package com.fundamental;

import java.util.Scanner;

public class B18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		
		if((year%400 == 0) || (year%4 ==0 && year%100!=0)) {
			System.out.println(year+" is leap year");
		}else {
			System.out.println(year+" is not leap year");
		}
		sc.close();
	}

}

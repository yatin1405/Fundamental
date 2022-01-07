package com.fundamental;

import java.util.Scanner;

public class B20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int average;
		for(int i=1; i<=5; i++)
		{
			System.out.println("Enter Number "+i);
			int num = sc.nextInt();
			sum+=num;
		}
		average = sum/5;
		System.out.println("The sum is: "+sum);
		System.out.println("The average is: "+average);
		
		sc.close();
	}
}

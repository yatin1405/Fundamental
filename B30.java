package com.fundamental;

import java.util.Scanner;

public class B30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 0 and 100");
		int num = sc.nextInt();
		if(num>=1 && num<=100) {
			if(num%3==0 && num%5==0) {
				System.out.println("Divided by 3 & 5: "+num);
			}
			else if(num%3==0) {
				System.out.println("Divided by 3: "+num);
			}
			else if(num%5==0) {
				System.out.println("Divided by 5: "+num);
			}
			else {
				System.out.println("Not divided by 3, 5");
			}
			
		}
		else {
			System.out.println("Please enter number between 0 & 100");
		}
		
	}

}

package com.fundamental;

import java.util.Scanner;

public class B16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number 1: ");
		int n1 = sc.nextInt();
		System.out.print("Enter number 2: ");
		int n2 = sc.nextInt();
		System.out.print("Enter number 3: ");
		int n3 = sc.nextInt();
		
		
		if(n1>=n2 && n1>=n3) {
			System.out.println("The Number 1 is greater");
		}
		else if(n2>=n1 && n2>=n3) {
			System.out.println("The Number 2 is greater");
		}
		else if(n3>=n1 && n3>=n2) {
			System.out.println("The Number 3 is greater");
		}
		sc.close();
	}

}

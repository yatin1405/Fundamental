package com.fundamental;

import java.util.Scanner;

public class B17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter single character from alphabet: ");
		String ch = sc.next().toLowerCase();
		
		boolean uppercase = ch.charAt(0) >= 65 && ch.charAt(0) <=90;
		boolean lowercase = ch.charAt(0) >= 97 && ch.charAt(0) <=122;
		boolean vowels = ch.equals("a") || ch.equals("e") || ch.equals("i") ||
				ch.equals("o") || ch.equals("u");
		
		if(ch.length()>1)
		{
			System.out.println("Error, Not a single character");
		}
		else if(!(uppercase || lowercase)) {
			System.out.println("Error, It's not a letter, Input lowercase or "
					+ "uppercase letter");
		}
		else if(vowels) {
			System.out.println("Input letter is vowel");
		}
		else {
			System.out.println("Input letter is consonent");
		}
		sc.close();
	}
}

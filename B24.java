package com.fundamental;

import java.util.Scanner;

public class B24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number of rows: ");
		int no_row = sc.nextInt();
		int c=1;
		for(int i=0; i<no_row; i++)
		{
			for(int blk=1; blk<=no_row-i; blk++)
			{
				System.out.print("");
			}
			for(int j=0; j<=i; j++)
			{
				if(j==0 || i==0)
				{
					c=1;
				}
				else
				{
					c=c*(i-j+1)/j;
				}
				System.out.print(""+c);
			}
			System.out.print("\n");
		}
		sc.close();
	}
}

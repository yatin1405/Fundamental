package com.fundamental;

public class B33 {
	public static void main(String[] args) {
		int sum = 1;
		int ctr = 0;
		int n = 0;
		while(ctr<100) {
			n++;
			if(n%2!=0) {
				if(is_Prime(n)) {
					sum+=n;
				}
			}
				ctr++;
		}
		System.out.println("sum of the prime number till 100: "+sum);
	}

	private static boolean is_Prime(int n) {
		for(int i=3; i*i<=n; i+=2) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}

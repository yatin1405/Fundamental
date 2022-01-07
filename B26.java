package com.fundamental;

public class B26 {
	public static void main(String[] args) {
		
		String s = "Hello i am 1405 $%#@ hjy^&*";
		char[] ch = s.toCharArray();
		
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isLetter(ch[i])) {
				letter++;
			}
			else if(Character.isSpace(ch[i])) {
				space++;
			}
			else if(Character.isDigit(ch[i])) {
				num++;
			}
			else {
				other++;
			}
		}
		System.out.println("Letter: "+letter);
		System.out.println("Space: "+space);
		System.out.println("Digit: "+num);
		System.out.println("Other: "+other);
		
	}
	

}

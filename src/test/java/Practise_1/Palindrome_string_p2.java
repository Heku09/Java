package Practise_1;

import java.util.Scanner;

public class Palindrome_string_p2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an String");
		String str=sc.next();
		String org_str=str;
		String rev="";
		
		for (int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if (org_str.equals(rev)) {
			System.out.println("Is a palindrome string");
		}
		else {
			System.out.println("not a palindrome string");
		}
	}

}

package practise;

import java.util.Scanner;

public class Palindrome_string {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
		
//		String org_str=str;
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("String is an palindrome string");
		}
		else {
			System.out.println("not an palindrome string");
		}
	}

}

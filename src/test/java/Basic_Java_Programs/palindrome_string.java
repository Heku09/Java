package Basic_Java_Programs;

import java.util.Scanner;

public class palindrome_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an string");
		String str=sc.next();
		
		String org_str=str;
		String rev="";
		
		for(int i=org_str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if (rev.equals(org_str)) {
			System.out.println("String is an Palindrome");
		}
		else{
			System.out.println("Not an palindrome");
			
		}
	}

}

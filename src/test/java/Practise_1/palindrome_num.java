package Practise_1;

import java.util.Scanner;

public class palindrome_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		
		int org_num=num;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev) {
			System.out.println("num is a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
	}

}

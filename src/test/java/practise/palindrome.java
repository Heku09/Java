package practise;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an number");
		int num=sc.nextInt();
		
		int org_num=num;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if (org_num==rev) {
			System.out.println("Number is a palindrome number");
		}
		else {
			System.out.println("Not a palindrome number");
		}
		
	}

}

package Basic_Java_Programs;

import java.util.Scanner;

public class palindrome_num {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an number");
		int num=sc.nextInt();
		int org_num=num;
		int rev=0;
		
		while (num!=0) {
			rev=rev*10+num%10; //provides the last integer 121%10=1 (basically its an reminder)
			num=num/10; //removes last integer 121/10=12 (basically divident value)
		}
		
		if(org_num==rev) {
			System.out.println("is a palindrom number");
		}
		else {
			System.out.println("not a palindrome number");
		}
	}


}

package Practise_1;

import java.util.Scanner;

public class Prime_p1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		
		int count=0;
		
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("Num is a prime number");
			}
			else {
				System.out.println("Number is not a prime num");
			}
		}
		
	}

}

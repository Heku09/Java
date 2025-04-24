package practise;

import java.util.Scanner;

public class Prime_number2_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		int count = 1;

		if (num > 1) {
			for (int i=1;i<=num;i++) {
				if(num%1==0) {
					count++;
				}
			
			}
		
			if(count==2) {
				System.out.println("is a prime number");
			}
			else {
				System.out.println("not a prime number");
			}
		}
	}
}

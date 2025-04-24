package Basic_Java_Programs;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
			System.out.println("Enter an number to check if its an prime number or not");
		int num=sc.nextInt();
		//int org_num=num;
		int count=0;
		
		if(num>1) {
			for (int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			
			}
			if (count==2) {
				System.out.println("number is an prime number");
			}
			else {
				System.out.println("not an prime number");
			}
		}
		
	}

}

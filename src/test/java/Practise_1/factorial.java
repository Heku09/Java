package Practise_1;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {

		//Scanner sc =new Scanner(System.in);
		//System.out.println("Enter an number");
		//int num=sc.nextInt();
		int num=5;
		int fact=1;
		
		
			for(int i=num;i>=1;i--) {
				fact=fact*i;					
		}
		System.out.println(fact);
	}

}

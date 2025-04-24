package Basic_Java_Programs;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5;
		int factorial=1;
		
		for (int i=num;i>=1;i--) {  //-> for5*4*3*2*1 and  //for(int i=1;i<=num:i++) for 1*2*3*4*5
			factorial=factorial*i;
		}
		System.out.println(factorial);
	
	}

}

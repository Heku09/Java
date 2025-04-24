package Practise_1;

public class Secong_highest_number {

	public static void main(String[] args) {

		int a[]= {1,4,3,6,3,7,8,9,16,15};
		int max1,max2;
		
		if (a[0]>a[1]) {
			max1=a[0];
			max2=a[1];
		}
		else {
			max1=a[1];
			max2=a[0];
		}
		
		for (int i=2;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2) {
				max2=a[i];
			}
		}
		System.out.println("Second highest number is max2 ="+ max2);
	}

}

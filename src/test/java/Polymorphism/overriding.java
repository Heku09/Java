package Polymorphism;

class Bank{
	double roi() {
		return 0;
	}
}

class HDFC extends Bank{
	double roi() {
		return 10.5;
	}
}

class ICIC{
	double roi() {
		return 11;
	}
}

public class overriding {
	public static void main(String[] args) {
		
		HDFC h=new HDFC();
		System.out.println(h.roi());
	}

}

package Basic_Java_Programs;

public class Count_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//#2: How to count character Occurrence in a given String 

		String str="Java is object oriented language";
		
		int result=str.length()-(str.replace("a", "").strip().length());
		System.out.println(result);
		
	}

}

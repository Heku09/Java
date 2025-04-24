package Basic_Java_Programs;

public class Duplicate_Character {

	public static void main(String[] args) {

		String str=new String("TestingAutomation");
		int count=0;
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("The duplicate char are ="+ch[j]);
					count++;
				}
			}
		}
	}

}

package LabQuestions;

public class Question6 {

	public static void main(String[] args) {
		
		cigarParty(50,true);

	}

	public static void cigarParty(int cigars, boolean weekend) {
		
		if (cigars>=40&&cigars<=60) {
			System.out.println("True");
			
		}else if(weekend==true&&cigars>=40) {
			System.out.println("True");
			
		}else {
			System.out.println("False");
		}
		
	}
}

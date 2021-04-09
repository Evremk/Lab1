package LabQuestions;

public class Question2 {

	public static void main(String[] args) {
		/*Question2 The number 6 is a truly great number. write a method 
		 * that accepts num1 and num2, prints true if either one is 6.
		 * Or if their sum or difference is 6.
		 */
		love6(66,60);
	}	

	public static void love6(int num1, int num2) {
		if(num1==6||num2==6||num1+num2==6||num1-num2==6||num2-num1==6)
		System.out.println("true");
		else {
			System.out.println("false");
		}
	}
}

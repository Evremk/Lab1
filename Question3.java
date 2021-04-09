package LabQuestions;

public class Question3 {

	public static void main(String[] args) {
		/*Question3 We'll say a number is special if it is a multiple of 11
		 * or if it is one more than a multiple of 11. Write a method that 
		 * accepts a number and prints true if the given number is special.
		 */
		SpecialEleven(110);
		SpecialEleven(25);
		SpecialEleven(100);

	}
	public static void SpecialEleven(int number) {
		
		if(number%11==0||number%11==1) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}
}

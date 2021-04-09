package LabQuestions;

public class Question1 {

	public static void main(String[] args) {
		
		/*Write a method that accepts a string and a non-negative number, 
		and prints a larger string that is number copies of the original
		String*/
		
		StringCopy("Ho",8);

	}
	public static void StringCopy (String message, int num) {
		if(num>=0) {
		for(int i=0;i<num;i++)
			System.out.print(message);
		}else {
			System.out.println("Negative number not accepted");
		
		
		}
	}
		
}

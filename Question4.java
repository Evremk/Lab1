package LabQuestions;

public class Question4 {

	public static void main(String[] args) {
		/*The deers in VA spend most of the day playing.
		 * In particular, they play if the temperature is between 60 and 90.
		 * Unless it is summer, then the upper limit id 100 instead of 90.
		 * Write a method that accepts temperature and a boolean isSummer, prints
		 * true if the deers play and false otherwise.
		 */

		deerPlay(64, true);
	}
	public static void deerPlay(int temperature, boolean isSummer) {
		if(isSummer==false&&temperature>60&&temperature<=90){
			System.out.println("True");
			
		}else if (isSummer==false&&(temperature<60||temperature>90)) {
				System.out.println("False");
				
		}else if (isSummer==true&&temperature>60&&temperature<=100) {
			System.out.println("True");
			
		}else {
				System.out.println("False");
			}
			
			
			
		}
	} 


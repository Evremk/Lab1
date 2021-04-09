package LabQuestions;

public class Question5 {

	public static void main(String[] args) {
		// Question 5
		
		//speed <=60 ->0
		//speed >60&&speed<=80 -->1
//		speed >=81 -->2
//		if birthday +5

				caughtSpeeding(85,false);
		

	}
	public static void caughtSpeeding(int speed, boolean birthday) {
		
		
		if((speed<=60)||birthday==true&&speed<=65) {
			System.out.println(0);
		
		}else if (speed>60&&speed<=80||birthday==true&&speed>65&&speed<=85) {
			System.out.println(1);
		}else if(speed>=81||birthday==true&&speed>=86) {
			System.out.println(2);
		}else {
				System.out.println("No valid speed");
				
			}
	
		
	}
	

	}



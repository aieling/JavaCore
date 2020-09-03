package Core;
/**
 * 
 */

/**
 * @author helenekev
 *
 */
public class Controls {
		public char gradeStudent(int grade) {
			char studentGrade = '0';
			if(grade<= 100 && grade >=90) {
				studentGrade = 'A';
			}
			else if(grade < 90 && grade >= 80) {
				studentGrade = 'B';
			}
			else if(grade < 80 && grade >= 70) {
				studentGrade = 'C';
			}
			else if(grade < 70 && grade >= 65) {
				studentGrade = 'D';
			}
			else if(grade < 65 && grade >= 0) {
				studentGrade = 'F';
			}
			else {
				System.out.println("Error, the student grade has to be between 0 and 100 included");
				return 0;
			}
			return studentGrade; 
		}
		
		public String printQuestion() {
			String question = "What is the correct way to declare a variable to store an integer value in Java? \n"
							+"a. int x = 10; \n"
							+"b. int 1_x = 10; \n"
							+"c. float x = 10.0f \n"
							+"d. string $x = \"10\"";
			return question;
		}
		
		public boolean checkAnswers(String answer) {
			boolean check = false;
			switch(answer.toLowerCase()) {
				case "a":
					check = true;
					System.out.println("Correct!");
				break;
				
				case "b":
					check = false;
					System.out.println("Try again.");
				break;
				
				case "c":
					check = false;
					System.out.println("Try again.");
				break;
				
				case "d":
					check = false;
					System.out.println("Try again.");
				break;
				
				default:
					System.out.println("Please enter an answer a/b/c/d");
				break;
			}
			return check;
		}
		
		

}

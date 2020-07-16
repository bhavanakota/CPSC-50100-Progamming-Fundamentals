import java.util. Random;
import java.util.Scanner;

public class AgeGuess {

	public static void main(String[] args) {
//		Lab 2 - Exercise 1
//		Modify the AgeGuess program from the last lab to do the following:
//			Declare a new int variable age
//			Initialize age to a random integer between 0 and 100 (inclusive)
//			Asks the user for a guess, save the guess into the ageGuess variable
//			Display the user guess and the correct answer
			
//      Created a new variable age
		
		int ageGuess;
		int age; 
		
		Scanner scan = new Scanner(System.in);
		
//      Saves the users guess into the ageGuess variable 
		
		System.out.print("Enter a guess for Age: ");
		ageGuess = scan.nextInt();
		
		
		Random rand = new Random();
		
//      Initializes age to a random variable between 0 and 100
		
		int upperbound = 101;
		age = rand.nextInt(upperbound);

//      Prints the user guess and the correct answer
		
		System.out.println("The user guessed " + ageGuess + " and the correct answer is "+ age);
		
		scan.close();
		
	}

}

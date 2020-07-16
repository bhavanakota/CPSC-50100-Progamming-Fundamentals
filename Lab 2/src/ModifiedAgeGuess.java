import java.util.Random;
import java.util.Scanner;

public class ModifiedAgeGuess {

	public static void main(String[] args) {
// 	Lab 2 - Exercise 4
//  a) Modify the AgeGuess program from Ex. 1 by adding a conditional statement (if statement)
//		to print out "You guessed wrong!" if the age and ageGuess variables are different.
//		Remember that "not equal to" comparison is done using the NOT (!=) relational operator.
//		Check to make sure the program runs without errors.
//	b) Add a nested if statement so that when the answer is wrong print out "older", if the age
//		guess was less than the actual age, and "younger", otherwise. Check to make sure the program
//		runs without errors.
//	c) Use the debugger (hit F11 in Eclipse) to run the program multiple times and check to make
//		sure each of the different messages gets displayed. Remember to put a breakpoint first
//		(CTRL+SHIFT+b).
		
		int ageGuess;
		int age; 
		
		Scanner scan = new Scanner(System.in);
				
		System.out.print("Enter a guess for Age: ");
		ageGuess = scan.nextInt();
		
		Random rand = new Random();
		
//      Creates a random number from 0 to 100
		
		int upperbound = 101;
		age = rand.nextInt(upperbound);

		System.out.println("\n");
		
//      If guess is wrong, print this
		
		if (age != ageGuess)
		{
		System.out.println("You guessed wrong!");
		
		}
		System.out.println("\n");
		
		if (age > ageGuess)
		{
		System.out.println("Guess older!");
		}
		
		if (age < ageGuess)
		{
		System.out.println("Guess younger!");
		}

		if (age == ageGuess)
		{
		System.out.println("You guessed correctly!");
		}
		scan.close();
		
	}

}

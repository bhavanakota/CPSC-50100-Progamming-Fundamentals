import java.util.Random;
import java.util.Scanner;

public class UserNames {

	public static void main(String[] args) {
//	   Lab 2 - Exercise 3
//     Write an application called UserNames that reads the user's first and last name (separately),
//    	 then prints a string composed of the first 4 letters of the user's last name, followed by the first
//    	 letter of the user's first name, followed by a random number in the range of 10 to 99 (inclusive).
//     You can assume the first name is at least one letter long and the last name is at least 4 letters.

//      Creating the string variables 
		
		String FirstName;
		String LastName;
		String FinalName;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		FirstName = scan.nextLine();
		
		System.out.print("Enter your last name: ");
		LastName = scan.nextLine();
		
		scan.close();
		
//      Creating the random integer generator 
		
        Random r = new Random();
        
        int low = 10;
        int high = 99;
        int result = r.nextInt(high-low) + low;
		
        System.out.println("Random number generated from 10 to 99: " + result);

//      Prints the first four letters of the last name 
        FinalName = LastName.substring(0,4);
        
//      Prints the first letter of the first name
        FinalName += FirstName.substring(0,1);
        
//      Combining the random number 
        FinalName += result;

        System.out.println("\n");

//      Printing the final result  
        
        System.out.println(FinalName);
        
	}

}

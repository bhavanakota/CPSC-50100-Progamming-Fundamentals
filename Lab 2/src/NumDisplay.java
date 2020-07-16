import java.util.Scanner;

public class NumDisplay {

	public static void main(String[] args) {
//		Lab 2 - Exercise 6
//		Make a program called NumDisplay.java that prompts the user enter a number between 0
//			and 9 and then display the corresponding word (i.e. "zero" for 0, "one" for 1, etc.). Use a
//			switch statement to do this. Include a default case that lets the user know they entered a
//			wrong number.

// 		Creating variables 
		
		 int value;

		Scanner scan = new Scanner(System.in); 

//    	Prompts the user to enter a number between 0 and 9 
		
		System.out.print("Enter a number from 0 to 9: ");
		value = scan.nextInt();
		
		System.out.println("\n");
		
		System.out.print("The value entered is ");
		
// 		Using switch to display the corresponding value
		
		      switch (value)
		      {
		      	case 0:
		      		System.out.println("zero."); break;
				case 1:
					System.out.println("one."); break;
				case 2:
					System.out.println("two."); break;
				case 3: 
					System.out.println("three."); break;
				case 4: 
					System.out.println("four."); break;
				case 5: 
					System.out.println("five."); break;
				case 6: 
					System.out.println("six."); break;
				case 7: 
					System.out.println("seven."); break;
				case 8: 
					System.out.println("eight."); break;
				case 9: 
					System.out.println("nine."); break;
					
// 		Default statement for an incorrect number
				default: 
					System.out.println("wrong. Please keep values between 0 and 9. ");	
		scan.close();
		
			}
		
	}		
}
		
		

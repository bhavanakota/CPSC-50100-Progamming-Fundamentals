public class FloatEqu {

	public static void main(String[] args) {
//		Lab 2 - Exercise 5
//      Make a Java program called FloatEqu.java and implement the following:
//		a) Declare a double variable and initialize it to(1.0/10) * (1.0/10)
//			Declare another double variable and initialize it to(1.0/100)
//			Insert an if … else statement and print out "EQUAL" if both variables are equal (use ==)
//			and "NOT EQUAL" otherwise. Run the program and check the output. Is it what you would expect?
//		b) Modify the program by adding a conditional statement to determine if the variables are
//			approximately equal, using the approach discussed in the lecture.

		
// 		Created variables and initialized them
		double a =(1.0/10) * (1.0/10);
		double b = (1.0/100);
		
//      Print out equal if the values are equal 	
		if (a == b)
		{
		System.out.println("Equal!");
		}

// 		Print out not equal if the values are not equal 
		if (a != b)
		{
		System.out.println("Not equal!");
		}

// 		Running the program and output is not what is expected. 
//			The program prints "Not Equal" but these values should be equal. 
		
//      b) Modify the program by adding a conditional statement to determine if the variables are
//      approximately equal, using the approach discussed in the lecture.
		
		if (Math.abs(a-b) < 0.0000001)
			System.out.println ("The variables are approximately equal");
		
		
		
	}

}

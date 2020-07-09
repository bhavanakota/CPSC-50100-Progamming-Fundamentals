import java.util.Scanner;

public class TimeComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seconds;
		int minutes;
		int hours;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of seconds: ");
		
		seconds = scan.nextInt();
		
		hours = seconds / 3600;
		minutes = (seconds % 3600) / 60;
		seconds = (seconds % 3600) % 60;
		
		System.out.println("\n");
		
		System.out.println ("The amount of hours are " + hours );

		System.out.println ("The amount of minutes are " + minutes );

		System.out.println ("The amount of seconds are " + seconds );

	}
	
}

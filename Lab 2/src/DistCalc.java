public class DistCalc {

	public static void main(String[] args) {
// 		Lab 2 - Exercise 2
//		Write an application called DistCalc that reads the (𝑥, 𝑦) coordinates for two points then
//			computes the distance between them using the following formula:
//			𝑑𝑖𝑠𝑡 = √(𝑥2 − 𝑥1)^2 + (𝑦2 − 𝑦1)^2
//		Display the result with three decimal places to the screen.

//      Creating variables 
		double distance; 
		float x1;
		float x2;
		float y1;
		float y2;
		
		Scanner scan = new Scanner(System.in);
		
//      Enter values for x1, y1, x2, y2
		System.out.print("Enter coordinate values for x1: ");
		x1 = scan.nextInt();
		System.out.print("Enter coordinate values for y1: ");
		y1 = scan.nextInt();
		
		System.out.print("Enter coordinate values for x2: ");
		x2 = scan.nextInt();
		System.out.print("Enter coordinate values for y2 : ");
		y2 = scan.nextInt();
		
		System.out.println("\n");
		
//      Inputing the entered numbers into the distance formula
		distance = Math.sqrt( Math.pow( x2-x1, 2) + Math.pow(y2-y1, 2));
		
//      Changing the decimal format to show only 3 digits
		DecimalFormat fmt = new DecimalFormat("0.###");

//      Print
		System.out.println("The distance between these points is " + fmt.format(distance));

		scan.close();
		
	}

}




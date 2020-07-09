
public class GradeAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double quizScore1 = 85.0;
		double quizScore2 = 90.0;
		double quizScore3 = 91.0;
		double testScore1 = 93.0;
		double testScore2 = 80.0;
		double quizScoreAvg;
		double testScoreAvg;
		
		quizScoreAvg = (quizScore1 + quizScore2 + quizScore3)/3;
		testScoreAvg = (testScore1 + testScore2)/2;
		
		System.out.println ("The quiz scores are " + quizScore1 + " " + quizScore2 + " " + quizScore3 );
		
		System.out.println ("The test scores are " + testScore1 + " " + testScore2);
		
		System.out.println("\n");

		System.out.println ("The quiz scores average is " + quizScoreAvg );

		System.out.println ("The test scores average is " + testScoreAvg );

	}

}

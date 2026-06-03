package assignments;

public class As21 {
	
	public static void validateScore(int score)
	{
		if(score>=0 && score<=100)
		{
			System.out.println("Valid Score");
		}
		else
		{
			System.out.println("Invalid score");
		}
	}
	public static void validateScore(int score, int passingScore)
	{
		if (score>passingScore)
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
	}
	
	public static void validateScore(int score, int passingScore, boolean isBonus)
	{
		if(score>=passingScore && isBonus)
		{
		System.out.println("Student is Excellent");	
		}
		else
		{
			System.out.println("student is not excellent");
		}
	}

	public static void main(String[] args) {
		validateScore(10);
		validateScore(90,81);
		validateScore(90,60,true);
		
		

	}

}

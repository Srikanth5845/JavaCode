package assignments;

public class As22 {

	public static void main(String[] args) {
		int marks=95;
		
		if (marks<0 || marks>100)
		{
			System.out.println("Invalid marks");
			return;
		}
		
		switch(marks/10)
		{
		case 10 :
		case 9  :
		case 8  :System.out.println("Distinct Pass");
		        break;
		case 7 :
			if(marks>=75)
			{
				System.out.println("Distinct Pass");
			}
			else
				System.out.println("First class pass");
			break;
		case 6 :System.out.println("First class pass");
		         break;
		case 5 :
		case 4 :
		case 3 :
			if(marks>=35 && marks<60)
			{
				System.out.println("second class");
			}
			else {
				System.out.println("fail");
			}
			break;
	 	}
		
		}

	}



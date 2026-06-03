package assignments;

public class As37 {
	
	As37()
	{this(100);
		System.out.println("one");
	}
	As37(int a)
	{
		System.out.println("two");
	}
	As37(double b)
	{ this();
		System.out.println("three");
	}

	public static void main(String[] args) {
		new As37(10.2);
		

	}

}

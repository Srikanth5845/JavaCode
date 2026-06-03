package assignments;

class As40one
{
	void method()
	{
		System.out.println("Parent");
	}
	
	
}
public class As40 extends As40one  {
	
	void method()
	
	{
		super.method();
		System.out.println("child");
	}
	

	public static void main(String[] args)
	{
		
          As40 a = new As40();
         a.method();
	}
}

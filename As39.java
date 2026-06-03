package assignments;

class As39one
{
	void method()
	{
		System.out.println("Parent");
	}
	
	
}
public class As39 extends As39one  {
	
	void method()
	{
		System.out.println("child");
	}
	

	public static void main(String[] args)
	{
		
          As39 a = new As39();
         a.method();
	}
}




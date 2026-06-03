package assignments;

public class As32_Child extends As32_Parent {
	static void method3()
	{
		System.out.println("method3");
	}
	 void method4()
	{
		System.out.println("method4");
	}

	public static void main(String[] args) {
		method1();
		As32_Child c=new As32_Child();
		c.method2();
		method3();
		c.method4();
		
		
		
	}

}

package assignments;

public class As33_Child extends As33_Parent {
	static void method3()
	{
		System.out.println("method3");
	}
	 void method4()
	{
		System.out.println("method4");
	}


	public static void main(String[] args) {
		As33_Child c = new As33_Child();
		c.method1();
		method2();
		method3();
		c.method4();
		
		
	}

}

package classnotes;

class N3
{
	static void method1()
	{
		System.out.println("method1");
	}
}
class N2 extends N3
{
	static void method2()
	{
		System.out.println("method2");
	}
} 
public class Inheritance extends N2
{
      static void method3()
      {
    	  System.out.println("method3");
      }
	public static void main(String[] args) {
		method1();
		



	}

}





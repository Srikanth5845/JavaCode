package classnotes;

public class Overloading {
	
	public static void login(String Username,String Password)
	{
		System.out.println("Username and Password");
	}
	public void login()
	{
		System.out.println("Login successfull");
	}
	public  Overloading(String Username,String Password)
	{
		System.out.println("Username and Password");
	}
	public Overloading()
	{
		System.out.println("Login successfull");
	}
	
	
   public static void main(String[] args) {
	   login("jhon","Tinku123");
	   Overloading a =new Overloading();
	   a.login();
	   new Overloading("srikanth","Tinku");
	   }

}

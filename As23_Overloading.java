package assignments;

public class As23_Overloading {
	
	public static void login(String Username,String Password)
	{
		System.out.println("Username and Password");
	}
	public void login()
	{
		System.out.println("Login successfull");
	}
	public  As23_Overloading(String Username,String Password)
	{
		System.out.println("Username and Password");
	}
	public As23_Overloading()
	{
		System.out.println("Login successfull");
	}
	
	
   public static void main(String[] args) {
	   login("jhon","Tinku123");
	   As23_Overloading a =new As23_Overloading();
	   a.login();
	   new As23_Overloading("srikanth","Tinku");
	   }

}



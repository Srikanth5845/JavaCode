package assignments;

public class As53 {

	public static void main(String[] args) 
	{
	 String a  ="mom";
	 String b= "";
	 for(int i=a.length()-1;i>=0;i--)
	 {
		 char c=a.charAt(i);
		 b =b+c;
	 }
	 System.out.println(b);
	  if(a.equals(b))
	  {
		  System.out.println("its is palindrome");
	  }
	  else
	  {
		  System.out.println("its is not palindrome");
	  }
			 
	 
		 

	}

}

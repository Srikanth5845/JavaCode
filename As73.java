package assignments;

public class As73 {

	public static void main(String[] args) {
		 StringBuilder s1=new StringBuilder("Automation");
	     System.out.println(s1.capacity());
	     s1.append("Testing");
         System.out.println(s1);

         s1.replace(0, 4, "Policy");
         
         System.out.println(s1);
         s1.insert(4, "Mobile");
         System.out.println(s1);
         
         StringBuilder s2=new StringBuilder("salesman");
         System.out.println(s2.reverse());
         
         
         StringBuilder s3=new StringBuilder("waterbottle"); 
         s3.delete(0, 5);
         System.out.println(s3);
         

	}

}

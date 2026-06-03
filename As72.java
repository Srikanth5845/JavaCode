package assignments;

public class As72 {

	public static void main(String[] args) {
		 StringBuffer s1=new StringBuffer("Automation");
	     System.out.println(s1.capacity());
	     s1.append("Testing");
         System.out.println(s1);

         s1.replace(0, 4, "Policy");
         
         System.out.println(s1);
         s1.insert(4, "Mobile");
         System.out.println(s1);
         
         StringBuffer s2=new StringBuffer("salesman");
         System.out.println(s2.reverse());
         
         
         StringBuffer s3=new StringBuffer("waterbottle"); 
         s3.delete(0, 5);
         System.out.println(s3);
         
      
         
      
         
	}

}

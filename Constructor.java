package classnotes;

class J3
{
        J3()        //this is cons
         {
        
        	
                System.out.println("Constructor 3");
         }
                
}
class J2 extends J3
{
        J2()      //this is cons
        {
        	
        	
            
                System.out.println("Constructor 2");
        }
}
public class Constructor extends J2
{
        Constructor()     //this is cons
        {
        
               
                System.out.println("Constructor 1");
        }
        public static void main(String[] args) 
        {
                new Constructor();
        }
}

package classnotes;


class ab
{
        void method4()
        {
                System.out.println("Login is happneing with Email id");
        }
}
public class aa extends ab
{
        void method4()
        {
                System.out.println("Login is happneing with Mobile No");
        }
        public static void main(String[] args) 
        {
                ab b1=new ab();
                b1.method4();
                
        }
}

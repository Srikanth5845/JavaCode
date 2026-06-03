package assignments;

public class As41 {
        public static int a=100;
        protected static int b=40;
         static int c=10;
        private static int d=5;
        
        public static void add()
        {
           System.out.println("add");     
        }
        protected static void sub()
        {
        	System.out.println("sub");       
        }
        static void mul()
        {
        	System.out.println("mul");     
        }
        private static void div()
        {
        	System.out.println("div");       
        }

        public static void main(String[] args) 
        {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
                add();
                sub();
                mul();
                div();
                

	}

}

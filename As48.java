package assignments;


interface Calculator {
    
    void add(int a, int b);
    void sub(int a, int b);
}


public class As48 implements Calculator {


    public void add(int a, int b) {
        int result = a + b;
        System.out.println("Addition: " + result);
    }

    
    public void sub(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction: " + result);
    }

  
    public static void main(String[] args) {
        
        As48 a= new As48();
        
        a.add(10, 5);
        a.sub(10, 5);
    }
}
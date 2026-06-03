package assignments;

interface As49parentone{
	void a();
}


interface As49parenttwo{
	void b();
}

public class As49 implements As49parenttwo,As49parentone {

	public static void main(String[] args) {
		As49 a =  new As49();

        a.a();
        a.b();
		

	}

	public void a() {
		System.out.println("a");
	
		
	}

	
	public void b() {
		
		System.out.println("b");
	}

}

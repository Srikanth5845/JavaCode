package assignments;

class As46GrandParent{
	static void gp()
	{
		System.out.println("GrandParent");
	}
	
}


abstract class As47parent extends As46GrandParent{
	abstract void add(int a, int b);
}

public class As47 extends As47parent{

	public static void main(String[] args) {
	

	}
	void add(int a,int b)
	{
		System.out.println("override");
	}

}

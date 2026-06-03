package assignments;


class As36_Grand_Parent{
	
	As36_Grand_Parent()
	{
		System.out.println("pp");
	}
	
	
	}
class As36_Parent extends As36_Grand_Parent{
    
	 As36_Parent(int a)
	{super();
		System.out.println("P");
	}
	
	
}
public class As36 extends As36_Parent {
	
		As36()
		{super(10);
		System.out.println("c");
			
		}
	

	public static void main(String[] args) {
		new As36();
		

	}

}

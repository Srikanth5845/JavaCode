package assignments;
class As38_GrandParent{
	 As38_GrandParent()
	{
		System.out.println("Grand parent1");
	}
	As38_GrandParent(double b)
	{ this();
		System.out.println("Grand parent para");
	}
	
	
}

class As38_Parent extends As38_GrandParent{
	
	 As38_Parent()
	{ super(10.2);
		System.out.println("Parent1");
	}
	
	 As38_Parent(int a)
	{ this();
		System.out.println("parent");
	}
	
	
	
}

public class As38 extends As38_Parent  {
	As38()
	
	{ this(10);
		
		System.out.println("child1");
	}
	 As38(int a)
	{  super(10);
		System.out.println("child para");
	}
	

	public static void main(String[] args) {
		new As38();
		

	}

}

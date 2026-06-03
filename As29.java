package assignments;

import java.util.Scanner;

public class As29 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of n=");
		int n= sc.nextInt();
		
		/*for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			System.out.println(i);
		}
		for(int i=0;i<=n;i++)
		{
			if(!(i%2==0))
			System.out.println(i);
		}*/
		int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(" Sum of first " + n + " numbers: " + sum);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();
		
		

	}

}

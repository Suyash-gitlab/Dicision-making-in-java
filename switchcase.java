package dicisionmaking;
import java.util.*;
public class switchcase {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number :");
		int a=sc.nextInt();
		System.out.print("Enter second number :");
		int b=sc.nextInt();
		
		System.out.println("1. addition");
		System.out.println("2. substraction :");
		System.out.println("3. multiplication :");
		System.out.println("4. division :");

		System.out.println("Enter choice for opration :");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			double c=a+b;
			System.out.println("Addition is :"+c);
			break;
			
			case 2:
			double d=a-b;
			System.out.println("substraction is :"+d);
			break;

			case 3:
			double e=a*b;
			System.out.println("Multiplication is :"+e);
			break;

			case 4:
			double f=a/b;
			System.out.println("division is :"+f);
			break;

			default :
				System.out.println("Your Choise is not matched...!!!");
		}
		sc.close();
	}

}


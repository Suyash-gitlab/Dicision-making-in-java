package dicisionmaking;
import java.util.*;
public class dowhileloop {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int ans=0;
		
		do 
		{
			System.out.println("Enter fisrt number :");
			int a=sc.nextInt();
			System.out.println("Enter second number :");
			int b=sc.nextInt();
			int c=a+b;
			System.out.println("Addition is :"+c);
			
			System.out.println("If you want to repeat then enter yes otherwise No");
			ans=sc.nextInt();

		}
		while(ans==0);{
			
		}
		System.out.println("Thank you");
		sc.close();
	}


}

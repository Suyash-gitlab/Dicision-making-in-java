package dicisionmaking;
import java.util.*;
public class ifelse {

	public static void main(String[] args) {		

		
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter your marks...");
					int mark=sc.nextInt();
					
					if(mark>=85)
					{
						System.out.println("A+ grade ...!!");
					}
					else if(mark>=75)
					{
						System.out.println("A grade...!!");
					}
					else if(mark>=65)
					{
						System.out.println("B+ grade...!!");
					}
					else if(mark>=55)
					{
						System.out.println("B grade...!!");
					}
					else if(mark>=45)
					{
						System.out.println("C+ grade...!!");
					}
					else if(mark>=35)
					{
						System.out.println("C grade...!!");
					}
					else
					{
						System.out.println("☠️ WOW You Are Fail...!!☠️");
					}
					
					sc.close();
				}

	}



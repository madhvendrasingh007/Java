package introduction;
import java.util.Scanner;

public class J10_conditionals {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		if(age>18)
			System.out.println("Your can vote");
		else
			System.out.println("You cant vote");
		
		sc.close();
		
		/* if (condition1) {
        		//Statements;
		   	  else if {
        		// Statements;
			   }
		    else {
        		//Statements
			} 
		 */
	}
}

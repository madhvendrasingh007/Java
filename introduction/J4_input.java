package introduction;
import java.util.Scanner;

public class J4_input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println("Your age is: ");
		System.out.println(age);
		
		sc.close();
	}
}

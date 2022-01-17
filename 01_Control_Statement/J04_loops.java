package introduction;
import java.util.Scanner;
public class J12_loops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		/*FOR LOOP*/
		System.out.println("Using for loop: ");
		for(int i=1;i<=num;i++) {
			System.out.println(i);
		}
		
		/*WHILE LOOP*/
		System.out.println("Using while loop: ");
		int i=1;
		while(i<=num) {
			System.out.println(i);
			i++;
			
		}
		
		/*DO-WHILE LOOP*/
		System.out.println("Using do-while loop: ");
		int j=1;
		do{
			System.out.println(j);
			j++;
		}while(j<=num);
		sc.close();
	}

}

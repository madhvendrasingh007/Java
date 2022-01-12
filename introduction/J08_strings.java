package introduction;
import java.util.Scanner;

public class J8_strings {
	public static void main(String[] args) {
		String name = new String("Madhvendra");
		//OR
		String name1 = " Singh";
		System.out.print(name + name1);
		
		System.out.println(" ");
		
		int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);  //here %8.2f means how much blank spaces will be created
        System.out.println(" ");
        System.out.format("The value of a is %d and value of b is %f", a, b);
        
        System.out.println(" ");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String st = sc.nextLine();
        //next take first word of the sentence while nextLine take the whole sentence
        System.out.print(st);
        
        sc.close();
	}
}


/*

%d -> int
%f -> float
%c -> char
%s -> string

*/
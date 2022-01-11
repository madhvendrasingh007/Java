package introduction;

public class J5_operator {
	public static void main(String[] args) {
		int a = 10;
		int b = a*5;
		System.out.println(b);
		
		if (a == b)
			System.out.println("a and b are equal");
		else
			System.out.println("a and b are not equal");
		
		System.out.println(b<a);
		
		System.out.println(18<88 && 23<84);
		System.out.println(18<88 && 23>84);
		
	}
}

/*
Unary			postfix				expr++ expr--
				prefix				++expr --expr +expr -expr ~ !
Arithmetic		multiplicative		* / %
				additive			+ -
Shift			shift				<< >> >>>
Relational		comparison			< > <= >= instanceof
				equality			== !=
Bitwise			bitwise AND			&
			   bitwise exclusive OR	^
			   bitwise inclusive OR	|
				Logical	logical AND	&&
				logical OR			||
				Ternary	ternary		? :
Assignment		assignment			= += -= *= /= %= &= ^= |= <<= >>= >>>=
*/
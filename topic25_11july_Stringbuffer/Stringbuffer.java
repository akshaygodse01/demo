package topic25_11july_Stringbuffer;

public class Stringbuffer {
	public static void main(String[] args) {

//		String s = new String("Hello");
//		System.out.println(s); // "Hello"
//		
//		String s2 = s.concat(" World");
//		System.out.println(s2); // "Hello World"
//		
//		System.out.println(s); // Hello

		// String constant pool is used in below case!!!
		System.out.println("With string pool ================ ");
		String a = "Welcome";
		String b = "Welcome";
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a == b); // true or false ? -> true

//		a = "Bye";
//		
//		System.out.println(a);
//		System.out.println(b);
		
		// String constant pool IS NOT used in below case!!
		System.out.println("Without string pool ================ ");
		String x = new String("Welcome");
		String y = new String("Welcome");
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(x == y); // true or false ? -> false, this compares the refs
		System.out.println(x.equals(y)); // -> true, this compares the strings!
		

//		x = "Bye";
//		
//		System.out.println(x);
//		System.out.println(y);
		
		
		// StringBuffer is class that allows modifications to the strings
		// StringBuffer is MUTABLE and Thread Safe
		// String is IMMUTABLE
		
		System.out.println("StringBuffer ============ ");
		StringBuffer sb = new StringBuffer("Welcome");
		System.out.println(sb);
		sb.append(" to Goa !");
		System.out.println(sb);
		
		sb.delete(2, 6); // 2,3,4,5
		System.out.println(sb);

		// StringBuilder is class that allows modifications to the strings
		// StringBuilder is MUTABLE but NOT thread safe!!
		System.out.println("StringBuilder ============ ");
		StringBuilder sbl = new StringBuilder("Welcome");
		System.out.println(sbl);
		sbl.append(" to Goa !");
		System.out.println(sbl);
		
		sbl.delete(2, 6); // 2,3,4,5
		System.out.println(sbl);
		

				
	}

}



package dTypes;

public class PrimitiveDatatypes {

	public static void main(String[] args) {
	

		//type of data , that a variable can hold is called the data types, (for better memory management)
		//in java , 2 types of data, (primitive and non-primitive)
		// in primitive , it either numeric(integer -> byte, short, int, long {l} , big integer and floating -> float{f}, double) or non-numeric (char, boolean)
		// non primtive Strings, Arrays and Class...

		// range (-2^n-1) to (2^n-1) -1 n = number of bits
		// 1 byte = 8 bits
		// short = 2 bytes (16 bits ) and char also 2 bytes
		// int = 4 bytes (32 bits) and float also 4 bytes
		// long = 8 bytes (64 bits) and double also 8 bytes
		// big intger has no Theoretical limit
		
		// boolean has no fixed value based on os it change, window 1 byte, linix 2 byte

		 byte b = 100;
		 short s = 30000;
		 int i = 100000;
		 long l = 10000000000L;

		 float f = 12.34f;
		 double d = 12345.6789;

		 char c = 'A';
		 boolean flag = true;

		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("int: " + i);
		System.out.println("long: " + l);
		System.out.println("float: " + f);
		System.out.println("double: " + d);
		System.out.println("char: " + c);
		System.out.println("boolean: " + flag);
		
		
		// normally java considered every floating value as , double only , so we explectly mentioned "f" suffix , for overcome explicit conversion 
		// float a = 59.98754 (double until suffix f)

		// similarly , for  long also , every integer value but of byte and short , it is considered as int only
		// so , mention "l/L" suffix, to overcome explicit conversion
		
		
		//OUTPUT
//		byte: 100
//		short: 30000
//		int: 100000
//		long: 10000000000
//		float: 12.34
//		double: 12345.6789
//		char: A
//		boolean: true


	}

}

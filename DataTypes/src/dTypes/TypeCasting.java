package dTypes;

public class TypeCasting {

	public static void main(String[] args) {
		
		int num = 100;
        double doubleNum = num;  // Widening or implicit conversion
        System.out.println("Widening: int to double = " + doubleNum);

        double d = 99.99;
        int i = (int) d;  // Narrowing or explicit conversion (data loss)
        System.out.println("Narrowing: double to int = " + i);
        
        // byte -> short -> int -> long -> float -> double
        
        // even tough , int and float are same types, conversion from int to float is , implicit
        // float to int is explicit
        // because , of ranmge of float is larger then range to int 

	}

}

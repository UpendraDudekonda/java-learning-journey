package dTypes;

public class Literals {

	public static void main(String[] args) {
		// The value stored inside the variable is called the literal
		
		 // 1. Integer Literals
        int decimal = 10;          // Decimal literal
        int binary = 0b1010;       // Binary literal (0b prefix)
        int octal = 012;           // Octal literal (0 prefix)
        int hexa = 0xA;            // Hexadecimal literal (0x prefix)

        // 2. Floating-point Literals
        double pi = 3.14159;       // Double literal
        float gravity = 9.8f;      // Float literal (with f or F)

        // 3. Character Literals
        char letter = 'A';         
        char digit = '7';          
        char newline = '\n';       // Escape character

        // 4. String Literal
        String name = "Upendra";

        // 5. Boolean Literal
        boolean isJavaFun = true;

        // 6. Null Literal
        String nothing = null;

        // 🖨️ Print all
        System.out.println("Integer Literals:");
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary (0b1010): " + binary);
        System.out.println("Octal (012): " + octal);
        System.out.println("Hexadecimal (0xA): " + hexa);

        System.out.println("\nFloating-point Literals:");
        System.out.println("Double: " + pi);
        System.out.println("Float: " + gravity);

        System.out.println("\nCharacter Literals:");
        System.out.println("Letter: " + letter);
        System.out.println("Digit: " + digit);
        System.out.println("Newline (below this): " + newline  + "See?");

        System.out.println("\nString Literal:");
        System.out.println("Name: " + name);

        System.out.println("\nBoolean Literal:");
        System.out.println("Is Java Fun? " + isJavaFun);

        System.out.println("\nNull Literal:");
        System.out.println("Nothing: " + nothing);
        
        //OUTPUT
//        Octal (012): 10
//        Hexadecimal (0xA): 10
//
//        Floating-point Literals:
//        Double: 3.14159
//        Float: 9.8
//
//        Character Literals:
//        Letter: A
//        Digit: 7
//        Newline (below this): 
//        See?
//
//        String Literal:
//        Name: Upendra
//
//        Boolean Literal:
//        Is Java Fun? true
//
//        Null Literal:
//        Nothing: null

	}

}

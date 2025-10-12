package operators;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Bitwise operators are performed on binary bits, called bitwise operators
		// there are 6 types  and &, or | , not  ~ , XOR ^, right shift >> (/2),left shift <<(x2),  unsigned right shift >>>
//		
//		| Operator | Name                 | Description                                                                       | Example (a = 5, b = 3)                        | Binary Operation          | Result |    |       |              |     |
//		| -------- | -------------------- | --------------------------------------------------------------------------------- | --------------------------------------------- | ------------------------- | ------ | -- | ----- | ------------ | --- |
//		| &      | Bitwise AND          | Sets each bit to `1` if both bits are `1`                                         | `a & b` → `5 & 3`                             | `0101 & 0011 = 0001`      | `1`    |    |       |              |     |
//		| |        | `                    | Bitwise OR                                                                        | Sets each bit to `1` if **either** bit is `1` | `a                        | b`→`5  | 3` | `0101 | 0011 = 0111` | `7` |
//		| `^`      | Bitwise XOR          | Sets each bit to `1` if bits are **different**                                    | `a ^ b` → `5 ^ 3`                             | `0101 ^ 0011 = 0110`      | `6`    |    |       |              |     |
//		| `~`      | Bitwise Complement   | Inverts all bits (changes `0` to `1` and `1` to `0`)                              | `~a` → `~5`                                   | `~0101 = 1010` (2’s comp) | `-6`   |    |       |              |     |
//		| `<<`     | Left Shift           | Shifts bits to the **left**, filling with `0` on the right                        | `a << 1` → `5 << 1`                           | `0101 → 1010`             | `10`   |    |       |              |     |
//		| `>>`     | Right Shift          | Shifts bits to the **right**, keeping the sign bit (MSB)                          | `a >> 1` → `5 >> 1`                           | `0101 → 0010`             | `2`    |    |       |              |     |
//		| `>>>`    | Unsigned Right Shift | Shifts bits to the **right**, filling with `0` on the left (no sign preservation) | `a >>> 1` → `5 >>> 1`                         | `0101 → 0010`             | `2`    |    |       |              |     |

		int a = 5;   // binary 0101
        int b = 3;   // binary 0011

        System.out.println("a & b = " + (a & b));   // 1 (0001)
        System.out.println("a | b = " + (a | b));   // 7 (0111)
        System.out.println("a ^ b = " + (a ^ b));   // 6 (0110)
        System.out.println("~a = " + (~a));         // -6 (1,110)
        System.out.println("a << 1 = " + (a << 1)); // 10 (1010)
        System.out.println("a >> 1 = " + (a >> 1)); // 2 (0010)
        System.out.println("a >>> 1 = " + (a >>> 1)); // 2 (0010)
        
        //OUTPUT
//        		a & b = 1
//        		a | b = 7
//        		a ^ b = 6
//        		~a = -6
//        		a << 1 = 10
//        		a >> 1 = 2
//        		a >>> 1 = 2
	}

}

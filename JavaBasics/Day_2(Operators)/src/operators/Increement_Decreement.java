package operators;

public class Increement_Decreement {

	public static void main(String[] args) {
		
		// increment , increase value by 1 (pre-increment ++1, post-increment 1++ )
		// decrement , decrease value by 1 (pre-decrement --1, post-decrement 1-- )
		
		var a = 11;
		var b = 0;
		var c = 0;
		var d = 0;
		var e = 0;
		
		b = ++a;
		c = a++;
		d = --a;
		e = a--;
		
		System.out.println(a); // gives same as 11
		System.out.println(b); // first increment to 12, then assign to b , so it is 12 (a=12)
		System.out.println(c); // first a=12 , assigned to b , then a increment to 13, so it is 12 (a=13)
		System.out.println(d); // first a=13, decrement to 12, then asign to d, so it is 12, 
		System.out.println(e); // first a=12 , assigned to e , then decrement to 11.
		System.out.println(a); // so , finally a=11 
		
		//output
//		11
//		12
//		12
//		12
//		12
//		11
		
		//tricky one
		var v1 = 5;
		var v2 = 3;
				// 5 4 5 6 5 6 =v1 
		v2 = --v1 + v1++ + ++v1 + v1-- + ++v1 ;
		++v2;
		System.out.println(v1); //6
		System.out.println(v2); //27

	}

}

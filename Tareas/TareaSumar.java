
public class TareaSumar {

	public static void main(String[] args) {

		int x = 6;// 1 + 2 + 3 + 4 + 5 + 6 = 21
		int c = 0;// 0 1 2 3 4 5
		// 1 2 3 4 5 6
		int s = 0;// 0 1 3 6 10 15
		// 1 3 6 10 15 21
		while (true) {
			System.out.println("x: " + x);
			c = c + 1;
			System.out.println("c: " + c);
			s = s + c;
			System.out.println("s: " + s);
			if (x == c) { // CUANDO TENGAS QUE HACER UNA OPERACION DESDE 0(1,2,3,4..) HASTA "X" UN
							// CONTADOR USALO PARA COMPARAR C y X
				break;
			}
			System.out.println("********************");
		}

		System.out.println("********************");
		System.out.println("********************");

		c = 0;// 5 6
		s = 0;// 15 21
		while (c < x) {
			System.out.println("x: " + x);
			c = c + 1;
			System.out.println("c: " + c);
			s = s + c;
			System.out.println("s: " + s);
			System.out.println("********************");
		}

	}

}

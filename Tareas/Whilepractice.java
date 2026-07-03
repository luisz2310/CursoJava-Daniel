
public class Whilepractice {

	public static void main(String arg[]) {
		int x = 0;
		while (x <= 500) {// al menos 10 veces
			System.out.println(x);
			x = x + 1;
		}

		while (true) {// al menos 10 veces
			System.out.println(x);
			x = x + 1;

			if (x == 500) {
				break;
			}
		}

	}
}

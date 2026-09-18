public class NumerosRango {

	public static void main(String[] args) {

		int m = 5;
		int n = 20;
		int x = 12;

		System.out.println("mayores que x:");
		for (int c = m; c <= n; c++) {

			if (c > x) {
				System.out.println(c);
			}
		}

		System.out.println("menores que x:");
		for (int c = m; c <= n; c++) {

			if (c < x) {
				System.out.println(c);
			}
		}

	}
}
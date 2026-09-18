public class Sumanumpares {

	public static void main(String[] args) {

		int n = 1;
		int m = 5;
		int r = 0;
		for (int c = n; c <= m; c++) {
			if (c % 2 == 0) {
				r = r + c;
			}

		}
		System.out.println(r);

	}

}
public class numero_mayor2 {
	public static void main(String arg[]) {

		int x = 1000;
		int y = 20000;
		int z = 500;

		boolean r1 = (x > y);
		boolean r2 = (x > z);
		boolean r3 = (y > z);
		boolean r4 = (y > x);

		boolean c1 = r1 && r2;
		boolean c2 = r3 && r4;

		//SUGERENCIA QUI
		//CUANDO usas el resulado de && o ||  solo para un if no necesitas guardarlo en una variable
	  //if (c1) {
		if(r1 && r2) {
			System.out.println("el mayor es x: " + x);
	  //}else if (c2) {
		}else if (r3 && r4) {
			System.out.println("el mayor es y: " + y);
		}else {
			System.out.println("el mayor es z:" + z);
		}
	}
}
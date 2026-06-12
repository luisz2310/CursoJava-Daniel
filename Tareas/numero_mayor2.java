```java id="xk2p9m"
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

		// 💡 BUENA PRÁCTICA:
		// Cuando una expresión lógica (&&, ||, comparaciones, etc.)
		// se utiliza únicamente dentro de un if, NO es necesario
		// guardarla en una variable intermedia.
		//
		//
		// ❌:
		// boolean c1 = r1 && r2;
		// if (c1)
		//
		// ✅ Mejor:
		// if (x > y && x > z)

		// ✔ Determinar el mayor directamente en la condición
		if (x > y && x > z) {
			System.out.println("El mayor es x: " + x);

		} else if (y > x && y > z) {
			System.out.println("El mayor es y: " + y);

		} else {
			System.out.println("El mayor es z: " + z);
		}
	}
}
```

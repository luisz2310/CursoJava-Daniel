import java.util.Random; // Librería para generar números aleatorios

public class Clase2_EstructurasdeControl_Repeticion_while {

	public static void main(String[] args) {

		/**
		 * ============================================
		 * 🔁 WHILE
		 * ============================================
		 * 
		 * while repite un bloque de código MIENTRAS
		 * la condición sea TRUE.
		 * 
		 * ✔ Se usa cuando NO sabes cuántas veces repetir
		 * ✔ Evalúa la condición en cada vuelta
		 */

		int x = 0; // variable de control

		/**
		 * ⚠️ while(true) = ciclo infinito
		 * 
		 * Este ciclo NUNCA termina por sí solo,
		 * necesitamos una salida manual (break)
		 */
		while (true) {

			System.out.println("Iteración del while infinito");

			/**
			 * ============================================
			 * 🛑 BREAK
			 * ============================================
			 * 
			 * break:
			 * ✔ TERMINA el ciclo inmediatamente
			 * ✔ "salta" completamente fuera del while
			 * ✔ NO ejecuta más iteraciones
			 * 
			 * Es como decir: "salte del ciclo YA"
			 */
			if (x == 3) {
				break; // rompe el ciclo completamente
			}

			x = x + 1; // IMPORTANTE: evita ciclo infinito real
		}

		System.out.println("Salí del while con break");
		System.out.println("*********************");

		/**
		 * ============================================
		 * 🔢 WHILE CON CONDICIÓN
		 * ============================================
		 */

		int z = 0; // contador

		while (z < 3) {

			System.out.println("Inicio del ciclo");

			System.out.println("Iteración número: " + z);

			System.out.println("Fin del ciclo");

			z = z + 1; // sin esto → ciclo infinito ⚠️
		}

		System.out.println("*********************");

		/**
		 * ============================================
		 * ⏭ CONTINUE
		 * ============================================
		 * 
		 * continue:
		 * ✔ NO termina el ciclo
		 * ✔ SALTA el resto del código actual
		 * ✔ va DIRECTO a la siguiente iteración
		 * 
		 * Es como decir: "este turno no me interesa, sigue"
		 */

		int y = 0;

		while (y < 10) {

			/**
			 * Ejemplo sin continue:
			 * solo filtramos pares
			 */
			if (y % 2 == 0) {
				System.out.println(y + " es par");
			}

			y = y + 1;
		}

		System.out.println("*********************");

		y = 0;

		while (y < 10) {

			int residuo = y % 2;

			/**
			 * Si el número es impar:
			 * usamos continue para SALTAR esta vuelta
			 */
			if (residuo != 0) {

				/**
				 * ⚠️ ERROR COMÚN:
				 * Si NO incrementas antes del continue,
				 * el ciclo se vuelve infinito
				 */
				y = y + 1;

				continue; 
				// 🔥 SALTO:
				// se brinca todo lo que sigue
				// y regresa al inicio del while
			}

			/**
			 * Este código SOLO se ejecuta
			 * cuando NO se activó el continue
			 */
			System.out.println(y + " es par");

			y = y + 1;
		}

		System.out.println("*********************");

		/**
		 * ============================================
		 * 🎯 DIFERENCIA CLAVE
		 * ============================================
		 * 
		 * break → SALE DEL CICLO COMPLETO
		 * continue → SALTA SOLO UNA ITERACIÓN
		 */

		/**
		 * break:
		 * while(...) {
		 *     break; → sale completamente
		 * }
		 * ↓ sigue aquí
		 */

		/**
		 * continue:
		 * while(...) {
		 *     continue; → salta esta vuelta
		 * }
		 * (el ciclo sigue)
		 */

		System.out.println("*********************");

		/**
		 * ============================================
		 * 🎲 RANDOM
		 * ============================================
		 */

		Random random = new Random();

		int r1 = random.nextInt(1000000);
		int r2 = random.nextInt(1000000);
		int r3 = random.nextInt(1000000);

		/**
		 * Solo importa el último valor asignado
		 */
		int r4 = random.nextInt(1000000);
		r4 = random.nextInt(1000000);
		r4 = random.nextInt(1000000);

		if (r4 < 1000) {
			System.out.println(r4 + " es menor que 1000");
		} else {
			System.out.println(r4 + " es mayor o igual que 1000");
		}

		System.out.println("*********************");

		/**
		 * ============================================
		 * 🔁 WHILE + RANDOM
		 * ============================================
		 */

		z = 0;

		while (z < 5) {

			int r5 = random.nextInt(2000);

			if (r5 < 1000) {
				System.out.println(r5 + " es menor que 1000");
			} else {
				System.out.println(r5 + " es mayor o igual que 1000");
			}

			z = z + 1;
		}

		System.out.println("fin del programa");

		/**
		 * ============================================
		 * 🧠 EJERCICIOS
		 * ============================================
		 */

		// 1️⃣ Imprime los primeros N números desde 0
		int n = 10; // salida esperada: 0 1 2 3 4 5 6 7 8 9 10

		// 2️⃣ Suma los números del 1 al N
		int n1 = 5; // resultado esperado: 15

		// 3️⃣ Genera números aleatorios hasta que salga 500
		// Ejemplo:
		// 5
		// 685
		// 34
		// 500 (termina aquí)
	}
}
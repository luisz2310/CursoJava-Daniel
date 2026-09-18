import java.util.Scanner; // Librería para leer datos desde la consola

/**
 * Clase 1 — Scanner para leer de la consola
 * Parte 1 — Scanner + ciclos
 *
 * Temas:
 * 1. Importar y crear el Scanner
 * 2. Leer números con nextInt()
 * 3. Sumar los números pares de un rango
 * 4. Reutilizar variables para leer nuevos valores
 * 5. Imprimir los números mayores y menores que un límite
 */
public class Parte1_ScannerInput {

    public static void main(String[] args) {

        /*
         * ============================================
         * 1. SCANNER
         * ============================================
         *
         * Scanner permite leer lo que el usuario escribe en la consola.
         *
         * System.in es la entrada estándar (el teclado).
         *
         * El Scanner se crea UNA sola vez
         * y se reutiliza en todo el programa.
         */

        Scanner sc = new Scanner(System.in); // Objeto para leer de la consola

        /*
         * ============================================
         * 2. SUMAR LOS PARES DE UN RANGO
         * ============================================
         *
         * El usuario ingresa un número inicial y uno final.
         * Sumamos solo los números pares que hay entre ellos.
         *
         * Si el rango es de 1 a 10:
         *
         * 2 + 4 + 6 + 8 + 10 = 30
         *
         * nextInt():
         * - Detiene el programa hasta que el usuario escribe un entero.
         * - Guarda el valor leído en la variable.
         *
         * Antes de cada lectura imprimimos un mensaje
         * para que el usuario sepa qué debe ingresar.
         */

        System.out.println("Ingresa el numero incial:");
        int n = sc.nextInt(); // Número inicial del rango

        System.out.println("Ingresa el numero final:");
        int m = sc.nextInt(); // Número final del rango

        int r = 0; // Acumulador: guarda la suma de los pares

        for (int c = n; c <= m; c = c + 1) { // c recorre el rango de n a m

            if (c % 2 == 0) { // Si el residuo es 0, c es par
                r = r + c;    // Agrega c a la suma anterior
            }
        }

        System.out.println(r); // Imprime la suma de los pares

        System.out.println("--------------------------------------");

        /*
         * ============================================
         * 3. MAYORES Y MENORES QUE UN LÍMITE
         * ============================================
         *
         * El usuario ingresa un rango y un límite x.
         *
         * Primero imprimimos los números del rango mayores que x.
         * Después imprimimos los menores que x.
         *
         * m y n ya fueron declaradas arriba,
         * por eso solo se les asigna un nuevo valor (sin int).
         *
         * Usamos dos for separados, uno para cada comparación.
         * El número igual a x no se imprime en ninguno.
         */

        System.out.println("Ingresa el numero incial:");
        m = sc.nextInt(); // Ahora m es el número inicial

        System.out.println("Ingresa el numero final:");
        n = sc.nextInt(); // Ahora n es el número final

        System.out.println("Ingresa el limite:");
        int x = sc.nextInt(); // Límite para comparar

        System.out.println("mayores que x:");

        for (int c = m; c <= n; c = c + 1) { // Recorre el rango de m a n

            if (c > x) { // Solo los mayores que el límite
                System.out.println(c);
            }
        }

        System.out.println("menores que x:");

        for (int c = m; c <= n; c = c + 1) { // Recorre el rango otra vez

            if (c < x) { // Solo los menores que el límite
                System.out.println(c);
            }
        }

        /*
         * RESUMEN
         *
         * Scanner:
         * - Lee datos del teclado mientras el programa se ejecuta.
         *
         * nextInt():
         * - Lee un número entero.
         *
         * Los datos leídos se pueden usar en:
         * - for
         * - if
         * - acumuladores
         */
    }
}

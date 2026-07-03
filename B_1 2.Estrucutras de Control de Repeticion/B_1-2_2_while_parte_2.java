import java.util.Random; // Librería para generar números aleatorios

/**
 * Clase 2 — Estructuras de control de repetición
 * WHILE — Parte 2
 *
 * Temas:
 * 1. Contadores y acumuladores
 * 2. while(true) con break
 * 3. while con una condición
 * 4. Números aleatorios
 * 5. Control del while con break o con una bandera
 */
public class Clase2_2_EstructurasdeControl_Repeticion_while {

    public static void main(String[] args) {

        /*
         * ============================================
         * 1. TAREA SUMAR
         * ============================================
         *
         * Sumar todos los números desde 1 hasta X.
         *
         * Si X vale 6:
         *
         * 1 + 2 + 3 + 4 + 5 + 6 = 21
         *
         * c es un CONTADOR:
         * avanza de 1 en 1.
         *
         * s es un ACUMULADOR:
         * guarda la suma anterior y agrega el nuevo número.
         */

        int x = 6; // Número límite: queremos sumar del 1 al 6
        int c = 0; // Contador: indica qué número estamos sumando
        int s = 0; // Acumulador: guarda el resultado de la suma

        /*
         * PRIMERA FORMA: while(true) + break
         *
         * while(true) no termina por sí solo.
         * Necesitamos usar break cuando c llegue a x.
         */

        while (true) { // Ciclo infinito hasta encontrar el break

            System.out.println("x: " + x); // Muestra el límite

            c = c + 1; // Avanza al siguiente número: 1, 2, 3...

            System.out.println("c: " + c); // Muestra el contador actual

            s = s + c; // Agrega el contador a la suma anterior

            System.out.println("s: " + s); // Muestra la suma acumulada

            if (x == c) { // Comprueba si llegamos al límite
                break;    // Sale completamente del ciclo
            }

            System.out.println("********************");
        }

        System.out.println("Resultado usando break: " + s);
        System.out.println("********************");

        /*
         * SEGUNDA FORMA: while con condición
         *
         * Esta forma realiza la misma suma, pero no necesita break.
         *
         * El ciclo termina automáticamente cuando:
         *
         * c < x
         *
         * se convierte en false.
         */

        c = 0; // Reiniciamos el contador para volver a comenzar
        s = 0; // Reiniciamos la suma

        while (c < x) { // Se repite mientras c sea menor que x

            System.out.println("x: " + x); // Muestra el límite

            c = c + 1; // Avanza al siguiente número

            System.out.println("c: " + c); // Muestra el contador

            s = s + c; // Suma el valor actual de c

            System.out.println("s: " + s); // Muestra la suma acumulada

            System.out.println("********************");
        }

        System.out.println("Resultado usando condición: " + s);

        /*
         * DIFERENCIA ENTRE LAS DOS FORMAS:
         *
         * while(true) + break:
         * - La condición siempre es true.
         * - break decide cuándo salir.
         *
         * while(c < x):
         * - La condición controla el ciclo.
         * - Termina automáticamente cuando c llega a x.
         *
         * Las dos formas producen el mismo resultado: 21.
         */

        System.out.println("========================================");

        /*
         * ============================================
         * 2. NÚMEROS ALEATORIOS
         * ============================================
         *
         * Generar números aleatorios entre 0 y 9
         * hasta que aparezca el número 6.
         *
         * No sabemos cuántas veces será necesario repetir.
         * Por eso while es apropiado para este problema.
         */

        Random random = new Random(); // Creamos el generador aleatorio

        /*
         * PRIMERA FORMA: while(true) + break
         */

        int z = 0; // Cuenta cuántos números fueron generados

        while (true) { // Continúa hasta encontrar el número 6

            int r = random.nextInt(10); // Genera un número entre 0 y 9

            z = z + 1; // Cuenta este intento

            System.out.println("Número aleatorio: " + r);
            System.out.println("Intento: " + z);

            if (r == 6) { // Comprueba si apareció el número buscado
                break;    // Sale inmediatamente del while
            }
        }

        System.out.println("El número 6 apareció después de " + z + " intentos");
        System.out.println("********************");

        /*
         * SEGUNDA FORMA: bandera booleana
         *
         * Una bandera es una variable boolean que controla el ciclo.
         *
         * true  -> el ciclo continúa
         * false -> el ciclo termina
         */

        boolean flag = true; // La bandera inicia en true
        z = 0;               // Reiniciamos el contador de intentos

        while (flag) { // Equivale a: while(flag == true)

            int r = random.nextInt(10); // Genera un número de 0 a 9

            z = z + 1; // Cuenta este intento

            System.out.println("Número aleatorio: " + r);
            System.out.println("Intento: " + z);

            if (r == 6) { // Comprueba si encontramos el número
                flag = false; // Cambia la condición para terminar el ciclo
            }
        }

        System.out.println("El número 6 apareció después de " + z + " intentos");

        /*
         * DIFERENCIA ENTRE break Y LA BANDERA:
         *
         * break:
         * - Sale inmediatamente del ciclo.
         * - No ejecuta las líneas posteriores al break.
         *
         * flag = false:
         * - No sale inmediatamente del bloque.
         * - Las líneas que estén después todavía pueden ejecutarse.
         * - El ciclo termina cuando vuelve a evaluar while(flag).
         *
         * Las dos formas sirven para detener el ciclo.
         */

        System.out.println("========================================");

        /*
         * ============================================
         * 3. IMPRIMIR NÚMEROS DEL 0 AL 500
         * ============================================
         *
         * Las siguientes formas imprimen los mismos números,
         * pero terminan de manera diferente.
         */

        /*
         * PRIMERA FORMA: while con condición
         *
         * La condición x0 <= 500 controla el ciclo.
         */

        int x0 = 0; // Número inicial

        while (x0 <= 500) { // Continúa mientras x0 sea menor o igual a 500

            System.out.println(x0); // Imprime el número actual

            x0 = x0 + 1; // Avanza al siguiente número
        }

        System.out.println("********************");

        /*
         * SEGUNDA FORMA: while(true) + break
         *
         * Reiniciamos x0 porque el ciclo anterior terminó con 501.
         *
         * Si no reiniciamos la variable, este ejemplo no comenzaría en 0.
         */

        x0 = 0; // Reinicia el número para repetir el ejercicio

        while (true) { // Ciclo infinito hasta ejecutar break

            System.out.println(x0); // Imprime el número actual

            if (x0 == 500) { // Comprueba si llegó al último número
                break;       // Sale del ciclo antes de aumentar a 501
            }

            x0 = x0 + 1; // Avanza al siguiente número
        }

        /*
         * DIFERENCIA ENTRE LAS DOS FORMAS:
         *
         * while(x0 <= 500):
         * - La condición indica cuándo terminar.
         * - No necesita break.
         *
         * while(true):
         * - Siempre es verdadero.
         * - Necesita un if y un break para terminar.
         *
         * En este problema es más sencillo usar:
         *
         * while(x0 <= 500)
         *
         * porque conocemos exactamente el límite.
         */

        System.out.println("Fin del programa");
    }
}
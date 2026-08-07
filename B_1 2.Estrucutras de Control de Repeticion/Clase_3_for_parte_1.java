import java.util.Random;

/**
 * Clase 2.3 — Estructuras de repetición: for
 */
public class Clase_3_for_parte_1 {

    public static void main(String[] args) {

        /*
         * ESTRUCTURA DEL FOR
         *
         * for (inicio; condición; actualización) {
         *     // código que se repite
         * }
         *
         * inicio:
         * - Se ejecuta una vez.
         *
         * condición:
         * - Se evalúa antes de cada iteración.
         * - true continúa y false termina.
         *
         * actualización:
         * - Se ejecuta al terminar cada iteración.
         *
         * Ninguna parte es obligatoria, pero los dos ";" sí.
         *
         * for (;;) {
         *     // ciclo infinito
         * }
         */

        // ============================================
        // WHILE: IMPRIMIR DEL 0 AL 500
        // ============================================

        int x0 = 0; // Contador inicial

        while (x0 <= 500) { // Continúa hasta llegar a 500
            System.out.println(x0); // Imprime el valor
            x0 = x0 + 1;            // Incrementa el contador
        }

        System.out.println("********************");

        // ============================================
        // MISMO EJERCICIO CON FOR
        // ============================================

        for (int x1 = 0; x1 <= 500; x1 = x1 + 1) {
            //     inicio      condición     incremento

            System.out.println(x1); // Imprime del 0 al 500
        }

        // x1 solo existe dentro del for
        // System.out.println(x1); // Error

        System.out.println("********************");

        // ============================================
        // FOR CON PARTES VACÍAS
        // ============================================

        int x1 = 0; // Declarado fuera del for

        for (; x1 <= 500;) { // Solo usamos la condición
            System.out.println(x1); // Imprime el valor
            x1 = x1 + 1;            // Incremento manual
        }

        // Como x1 se declaró fuera, todavía existe
        System.out.println("Valor final de x1: " + x1);

        /*
         * DIFERENCIA:
         *
         * while:
         * - El inicio y el incremento están separados.
         *
         * for:
         * - Organiza inicio, condición e incremento juntos.
         *
         * for con partes vacías:
         * - Funciona parecido a un while.
         */

        System.out.println("========================================");

        // ============================================
        // SUMAR DEL 1 AL 6 CON WHILE
        // ============================================

        int x = 6; // Límite de la suma
        int c = 0; // Contador
        int s = 0; // Acumulador

        while (true) { // Ciclo infinito controlado con break

            System.out.println("x: " + x);

            c = c + 1; // Avanza: 1, 2, 3, 4, 5, 6
            System.out.println("c: " + c);

            s = s + c; // Acumula la suma
            System.out.println("s: " + s);

            if (x == c) { // Si llegamos al límite
                break;    // Termina el ciclo
            }

            System.out.println("********************");
        }

        System.out.println("Resultado con while: " + s);

        System.out.println("========================================");

        // ============================================
        // MISMA SUMA CON FOR Y BREAK
        // ============================================

        s = 0; // Reinicia el acumulador

        for (c = 0; true; c = c + 1) {
            // true crea un ciclo infinito

            System.out.println("x: " + x);
            System.out.println("c: " + c);

            s = s + c; // Suma de 0 a 6
            System.out.println("s: " + s);

            if (x == c) { // Cuando c llegue a 6
                break;    // Termina el for
            }
        }

        // c existe porque se declaró fuera del for
        System.out.println("Resultado con for: " + s);
        System.out.println("Valor final de c: " + c);

        System.out.println("========================================");

        // ============================================
        // VARIABLE DECLARADA DENTRO DEL FOR
        // ============================================

        s = 0; // Reinicia el acumulador

        for (int c1 = 0; true; c1 = c1 + 1) {

            System.out.println("x: " + x);
            System.out.println("c1: " + c1);

            s = s + c1; // Acumula la suma
            System.out.println("s: " + s);

            if (x == c1) { // Cuando c1 llegue a 6
                break;
            }
        }

        // c1 solo existe dentro del for
        // System.out.println(c1); // Error

        System.out.println("Resultado final: " + s);

        /*
         * RESUMEN
         *
         * for:
         * - Útil cuando tenemos un contador.
         *
         * break:
         * - Termina completamente el ciclo.
         *
         * Variable dentro del for:
         * - Solo existe dentro del ciclo.
         *
         * Variable fuera del for:
         * - Puede usarse después del ciclo.
         */

        System.out.println("Fin del programa");
        
        
     // ============================================
     // REPASO
     // ============================================


     // ============================================
     // WHILE
     // ============================================
     //
     // Usamos WHILE cuando:
     // - No sabemos exactamente cuántas veces se va a repetir una acción.
     // - La repetición depende de una condición externa.
     // - No necesariamente necesitamos un contador.
     //
     // Ejemplo:
     // Generamos números aleatorios hasta encontrar el número 6.
     //

     Random random = new Random();

     int intentos = 0;

     while (true) {

         int numero = random.nextInt(10);

         System.out.println("Número generado: " + numero);
         System.out.println("Intento: " + intentos);

         if (numero == 6) {
             break; // Sale del ciclo cuando encuentra el 6
         }

         intentos++;
     }


     // En este caso usamos WHILE, pero tiene un contador.
     // Funciona correctamente, pero no es la mejor opción.
     //
     // Cuando sabemos exactamente cuántas veces queremos repetir algo,
     // normalmente usamos FOR.
     //

     int contador = 0;

     while (contador <= 5) {

         System.out.println(contador);

         contador = contador + 1; // Incrementamos para evitar ciclo infinito
     }


     // ============================================
     // FOR
     // ============================================
     //
     // Usamos FOR cuando:
     // - Sabemos cuántas veces queremos repetir una acción.
     // - Necesitamos un contador.
     // - Tenemos un inicio, una condición y un incremento.
     //
     // Estructura:
     //
     // for (inicio; condición; incremento) {
     //           código a repetir
     // }
     //


     // Contar del 0 al 5

     for (int contadorFor = 0; contadorFor <= 5; contadorFor = contadorFor + 1) {

         System.out.println(contadorFor);

     }


     // ============================================
     // FOR CON DECREMENTO
     // ============================================
     //
     // También podemos usar FOR para contar hacia atrás.
     //

     for (int contadorFor = 100; contadorFor > 0; contadorFor = contadorFor - 1) {

         System.out.println(contadorFor);

     }
     
    }
}
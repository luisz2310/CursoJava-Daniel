public class EstructurasDeControl {

    public static void main(String arg[]) {

        /**
         * ============================================
         * 🧠 ESTRUCTURAS DE CONTROL CONDICIONALES
         * ============================================
         * 
         * Permiten tomar decisiones en el programa.
         * Evalúan condiciones que devuelven true o false.
         * 
         * if -> equivalente al rombo en un diagrama de flujo
         */

        /**
         * ✏️ ESTRUCTURA BÁSICA DEL IF
         * 
         * if (CONDICION) {
         *     // código que se ejecuta si la condición es verdadera
         * }
         * 
         * - El if evalúa un booleano (true o false)
         * - Si es true → entra al bloque
         * - Si es false → lo ignora
         */

        int x = 10; // la declaración siempre lleva tipo (solo se declara una vez)

        // Ejemplo básico
        if (x == 0) {
            System.out.println("X es igual a 0");
        }

        // Ejemplo equivalente (evaluación directa)
        if (false) { // x == 0 -> false
            System.out.println("X es igual a 0");
        }

        // Usando variable booleana
        boolean r = x == 0;
        if (r) {
            System.out.println("X es igual a 0");
        }

        /**
         * ============================================
         * 🔗 OPERADORES LÓGICOS EN CONDICIONES
         * ============================================
         * 
         * &&  → AND (ambas deben ser true)
         * ||  → OR (al menos una true)
         */

        x = 10; // actualizamos valor (no redeclaramos)
        int y = 5;
        int z = 2;

        // true && false → false
        if (z < x && z > y) { // 2 < 10 && 2 > 5
            System.out.println("No entra aquí");
        }

        // true && true → true
        if (z < x && z < y) { // 2 < 10 && 2 < 5
            System.out.println("z es menor que x y y");
        }

        // false || false → false
        if (x == y || x == z) {
            System.out.println("No entra aquí");
        }

        /**
         * ============================================
         * 🔄 COMPARACIONES MÚLTIPLES
         * ============================================
         */

        int x1 = 0;
        int x2 = 100;

        if (x1 > x2) {
            System.out.println("x1 es mayor");
        }

        if (x1 < x2) { // x2 > x1
            System.out.println("x2 es mayor");
        }

        if (x1 == x2) {
            System.out.println("x1 y x2 son iguales");
        }

        /**
         * ============================================
         * 🔀 IF - ELSE
         * ============================================
         * 
         * Se usa cuando quieres ejecutar:
         * - un bloque si se cumple
         * - otro si NO se cumple
         */

        if (x1 == 0) {
            // se cumple
            System.out.println("x1 es igual a 0");
        } else {
            // no se cumple
            System.out.println("x1 no es igual a 0");
        }

        /**
         * ============================================
         * 🧪 EJEMPLOS EXTRA (más práctica)
         * ============================================
         */

        int edad = 18;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        int numero = -5;

        if (numero > 0) {
            System.out.println("Número positivo");
        } else if (numero < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Es cero");
        }

        /**
         * ============================================
         * 🏁 FIN DEL PROGRAMA
         * ============================================
         */

        System.out.println("fin");
    }
}
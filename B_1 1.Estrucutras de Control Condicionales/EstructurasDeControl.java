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
         * 
         * Aplicación de condicionales en casos reales
         */

        int edad = 18;

        // ✔ Validación básica
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        int numero = -5;

        // ✔ Clasificación de número
        if (numero > 0) {
            System.out.println("Número positivo");
        } else if (numero < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Es cero");
        }

        /**
         * ============================================
         * ⚠️ DIFERENCIA: if separados vs if-else if
         * ============================================
         */

        int r1 = 10;

        // 🔹 IF SEPARADOS
        // Todas las condiciones verdaderas se ejecutan
        // (pueden imprimirse varias líneas)
        if (r1 < 10) {
            System.out.println("r es menor que 10");
        }

        if (r1 < 20) { // true
            System.out.println("r es menor que 20");
        }

        if (r1 < 30) { // true
            System.out.println("r es menor que 30");
        }

        if (r1 < 40) { // true
            System.out.println("r es menor que 40");
        } else {
            System.out.println("r es mayor o igual a 40");
        }

        if (r1 < 50) { // true
            System.out.println("r es menor que 50");
        }

        // 🔹 IF - ELSE IF
        // Solo se ejecuta la PRIMERA condición verdadera
        if (r1 < 10) {
            System.out.println("r es menor que 10");
        } else if (r1 < 20) { // aquí entra y se detiene
            System.out.println("r es menor que 20");
        } else if (r1 < 30) {
            System.out.println("r es menor que 30");
        } else if (r1 < 40) {
            System.out.println("r es menor que 40");
        } else if (r1 < 50) {
            System.out.println("r es menor que 50");
        } else {
            System.out.println("r es mayor o igual a 50");
        }

        /**
         * ============================================
         * 🔁 SWITCH (comparación por igualdad)
         * ============================================
         * 
         * Se usa cuando comparas un valor contra muchos casos
         */

        int z1 = 5;

        switch (z1) {
            case 1:
                System.out.println("z1 es igual a 1");
                break;
            case 2:
                System.out.println("z1 es igual a 2");
                break;
            case 5:
                System.out.println("z1 es igual a 5"); // ✔ caso que sí se cumple
                break;
            default:
                System.out.println("Nada coincidió");
                break;
        }

        /**
         * ============================================
         * 🔤 SWITCH CON CHAR
         * ============================================
         */

        char c = 'r';

        switch (c) {
            case 'r':
                System.out.println("Caso r (se ejecuta una vez)");
                break;
            case 'z':
                System.out.println("Caso z");
                break;
            case 'w':
                System.out.println("Caso w");
                break;
            default:
                System.out.println("Ninguna opción coincidió");
                break;
        }

        // 🔁 MISMO EJEMPLO CON IF
        if (c == 'r') {
            System.out.println("Caso r");
        } else if (c == 'z') {
            System.out.println("Caso z");
        } else if (c == 'w') {
            System.out.println("Caso w");
        }

        /**
         * ============================================
         * ⚡ SWITCH MODERNO (Java 14+)
         * ============================================
         */

        int z2 = 2;

        switch (z2) {
            case 1 -> System.out.println("Caso 1");
            case 2 -> System.out.println("Caso 2"); // ✔ entra aquí
            case 3 -> System.out.println("Caso 3");
            default -> System.out.println("No coincidió");
        }

        /**
         * ============================================
         * 🔗 MÚLTIPLES VALORES EN UN MISMO CASO
         * ============================================
         */

        c = 'z';

        switch (c) {
            case 'r':
            case 'z':
                System.out.println("Es r o z");
                break;
            case 'w':
                System.out.println("Es w");
                break;
            case 's':
            case 'l':
                System.out.println("Es s o l");
                break;
            default:
                System.out.println("No coincidió");
                break;
        }

        // 🔁 MISMO CON IF
        if (c == 'r' || c == 'z') {
            System.out.println("Es r o z");
        } else if (c == 'w') {
            System.out.println("Es w");
        } else if (c == 's' || c == 'l') {
            System.out.println("Es s o l");
        } else {
            System.out.println("No coincidió");
        }

        /**
         * ============================================
         * 🎯 CONSEJO
         * ============================================
         * 
         * Primero haz que el programa funcione correctamente.
         * Después optimiza o mejora el código.
         */

        
    }
}
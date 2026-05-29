/**
 * 📘 Clase — Operadores Lógicos en Java
 */
public class Operadores_Logicos {

    // Todo programa en Java inicia en el método main
    public static void main(String[] args) {

        // =========================
        // TIPO BOOLEANO
        // =========================

        /**
         * Tipo booleano -> verdadero o falso (true / false)
         */

        // =========================
        // OPERADORES DE COMPARACIÓN
        // =========================

        /**
         * Operadores lógicos (comparación)
         * 
         * Comparan 2 valores
         * 
         * >  mayor que
         * <  menor que
         * == igual que
         * != diferente que
         * >= mayor o igual
         * <= menor o igual
         * !  negación
         * 
         * Comparan números o letras
         * 
         * 1 > 0  -> true
         * 0 > 1  -> false
         * 
         * int a = 10
         * a > 5   -> true
         * a == 10 -> true
         * 
         * int b = 15
         * a >= b -> false
         * a != b -> true
         * 
         * ⚠️ Si no guardas el resultado, se pierde
         */

        int a = 5;
        int b = 10;

        // Ejemplos básicos
        System.out.println(a > b);
        System.out.println(5 > 10);
        System.out.println(false);

        System.out.println(a < b);
        System.out.println(5 < 10);
        System.out.println(true);

        // Guardando resultados
        boolean r = a > b;
        boolean r1 = true;
        boolean r2 = false;
        // boolean r3 = 10; ❌ solo acepta true o false

        // =========================
        // MÁS EJEMPLOS DE COMPARACIÓN
        // =========================

        System.out.println("----------------");

        System.out.println(a == b);  // false
        System.out.println(a != b);  // true
        System.out.println(a <= b);  // true
        System.out.println(a >= b);  // false

        // =========================
        // OPERADORES BOOLEANOS (COMPUESTOS)
        // =========================

        /**
         * Operadores booleanos (compuertas lógicas)
         * 
         * && -> AND (y)
         * || -> OR (o)
         * !  -> NOT (negación)
         */

        int z = 20;
        int y = 5;
        int w = 10;

        System.out.println(z > y);
        System.out.println(z > w);

        boolean r3 = z > y;
        boolean r4 = z > w;

        // AND: ambas deben ser true
        boolean r5 = r3 && r4;

        // OR: al menos una true
        boolean r6 = r3 || r4;

        // NOT: invierte el valor
        boolean r7 = !r3;

        System.out.println("z :" + z);
        System.out.println("y :" + y);
        System.out.println("w :" + w);

        System.out.println("z es mayor que y y w? (AND): " + r5);
        System.out.println("z es mayor que alguno? (OR): " + r6);
        System.out.println("negación de (z > y): " + r7);

        // =========================
        // EJEMPLOS MÁS REALES
        // =========================

        int edad = 18;

        boolean esMayor = edad >= 18;
        System.out.println("¿Es mayor de edad?: " + esMayor);

        int nota = 85;

        boolean aprobo = nota >= 70;
        System.out.println("¿Aprobó?: " + aprobo);

        // combinación
        boolean acceso = (edad >= 18) && (nota >= 70);
        System.out.println("¿Tiene acceso?: " + acceso);

        // =========================
        // CONCATENACIÓN
        // =========================

        System.out.println("mi variable tiene el valor de " + a);
        System.out.println("mi variable a " + a + " tiene ese valor");

    }
}
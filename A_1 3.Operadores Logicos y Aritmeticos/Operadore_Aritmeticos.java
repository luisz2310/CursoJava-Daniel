/**
 * 📘 Clase — Operadores Aritméticos en Java
 */
public class Operadore_Aritmeticos {

    // Todo programa en Java inicia en el método main
    public static void main(String[] args) {

        // =========================
        // OPERADORES ARITMÉTICOS
        // =========================

        /**
         * OPERACIONES ARITMETICAS
         * SUMA / RESTA / DIV / ETC
         * 
         * + -> SUMAR 2 VALORES
         * - -> RESTAR 2 VALORES
         * * -> MULTIPLICAR
         * / -> DIVICION
         * % -> MODULO (REGRESA EL RESIDUO DE LA DIVISION)
         * 
         * SIEMPRE ES LA OPERACION DE 2 VALORES
         * 
         * 1 + 2
         * 1 - 2
         * 
         * a = 5
         * a + 1
         * a * 5
         * 10 / a
         * a % 2
         * 
         * int a = 99999999
         * a - 100000
         * 
         * int a, b = 10
         * a - b
         * b + a
         * 
         * SIEMPRE SE REGRESA UN RESULTADO Y SI NO SE USA O GUARDA SE PIERDE
         */

        // =========================
        // EJEMPLOS BÁSICOS
        // =========================

        int a = 10;
        int b = 5;

        // Esta suma se pierde porque no la guardamos
        System.out.println(a + b);

        // Equivalente:
        // System.out.println(10+5);
        // System.out.println(15);

        // Guardando el resultado
        int r = a + b;
        System.out.println(r);

        // =========================
        // MÁS OPERACIONES
        // =========================

        a = 20;
        b = 30;

        r = a + b;
        System.out.println(r);

        r = a - b;
        System.out.println(r);

        r = a / b;
        System.out.println(r);

        r = a * b;
        System.out.println(r);

        r = a % b;
        System.out.println(r);

        System.out.println("Fin");

        // =========================
        // COMBINACIÓN DE TIPOS
        // =========================

        System.out.println("--------------------------");

        int i = 9999999;
        byte s = 16;

        System.out.println(i + s);
        System.out.println(i - s);

        // byte s1 = i + s; ❌ Error
        int i1 = i + s; // ✔ correcto (resultado mínimo es int)

        short s2 = 1;
        byte b2 = 16;

        int s3 = s2 + b2; 
        // si ambos son tipos pequeños (byte/short), el resultado es int o mayor (long)

        // =========================
        // NOTAS IMPORTANTES
        // =========================

        // IDE -> Integrated Development Environment
        // JDK -> Java Development Kit -> Set de herramientas (clases y métodos)

    }
}
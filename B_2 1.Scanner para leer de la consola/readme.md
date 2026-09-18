# 📘 Clase 1 – Scanner para Leer de la Consola en Java

# 🧠 ¿Qué es?

`Scanner` es una clase de Java que permite **leer datos que el usuario escribe en la consola**. Hasta ahora los valores estaban escritos dentro del código; con `Scanner` el programa puede pedirlos mientras se ejecuta.

---

# ⌨️ SCANNER

## 📥 Importar la clase

`Scanner` vive en el paquete `java.util`, por lo que hay que importarlo al inicio del archivo:

```java
import java.util.Scanner;
```

## 🛠️ Crear el Scanner

```java
Scanner sc = new Scanner(System.in);
```

* `System.in` es la entrada estándar (el teclado).
* `sc` es el nombre del objeto que usaremos para leer.
* Se crea **una sola vez** y se reutiliza en todo el programa.

---

## 🔢 LEER UN NÚMERO

```java
System.out.println("Ingresa el numero incial:");
int n = sc.nextInt();
```

1. `println` muestra un mensaje para que el usuario sepa qué escribir.
2. `sc.nextInt()` **detiene el programa** hasta que el usuario escriba un entero y presione Enter.
3. El valor leído se guarda en la variable `n`.

👉 Clave mental: **“Pregunta, espera y guarda.”**

---

## 📋 MÉTODOS DE LECTURA

Cada tipo de dato tiene su método:

| Método | Lee | Ejemplo |
|---|---|---|
| `nextInt()` | `int` | `int n = sc.nextInt();` |
| `nextDouble()` | `double` | `double d = sc.nextDouble();` |
| `nextBoolean()` | `boolean` | `boolean b = sc.nextBoolean();` |
| `next()` | Una palabra (`String`) | `String p = sc.next();` |
| `nextLine()` | Una línea completa (`String`) | `String t = sc.nextLine();` |

⚠️ Si el usuario escribe algo que no corresponde al tipo (por ejemplo, `hola` en un `nextInt()`), el programa se detiene con un error `InputMismatchException`.

---

# 🧪 EJEMPLO

## ➕ Sumar los pares de un rango

El usuario indica el número inicial y el final. El programa suma solo los números pares que hay entre ellos.

```java
Scanner sc = new Scanner(System.in);

System.out.println("Ingresa el numero incial:");
int n = sc.nextInt();

System.out.println("Ingresa el numero final:");
int m = sc.nextInt();

int r = 0; // Acumulador

for (int c = n; c <= m; c = c + 1) {
    if (c % 2 == 0) {   // Solo los pares
        r = r + c;
    }
}

System.out.println(r);
```

* `c` recorre el rango desde `n` hasta `m`.
* `c % 2 == 0` filtra los números pares.
* `r` es el **acumulador** que guarda la suma.

Con `n = 1` y `m = 10`: `2 + 4 + 6 + 8 + 10 = 30`.

---

# 🧠 CONCEPTOS CLAVE

* `Scanner` lee datos del teclado mientras el programa se ejecuta.
* Se necesita `import java.util.Scanner;` y `new Scanner(System.in)`.
* `nextInt()`, `nextDouble()`, `next()` y `nextLine()` leen distintos tipos de datos.
* Antes de cada lectura conviene imprimir un mensaje que indique qué ingresar.
* Los datos leídos se pueden usar en `for`, `if`, acumuladores y operaciones.

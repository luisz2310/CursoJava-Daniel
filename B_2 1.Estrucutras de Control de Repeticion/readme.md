# 📘 Clase 2 – Estructuras de Control de Repetición en Java

## 📌 Descripción

Este archivo contiene ejemplos prácticos sobre el uso de estructuras de repetición en Java, enfocándose principalmente en:

* `while`
* `break`
* `continue`
* Uso de números aleatorios (`Random`)

El objetivo es entender **cómo controlar la ejecución de ciclos**, cuándo detenerlos y cómo saltar iteraciones.

---

## 🔁 WHILE

El ciclo `while` repite un bloque de código **mientras una condición sea verdadera**.

```java
while (condicion) {
    // código a repetir
}
```

### 🧠 ¿Cuándo usarlo?

* Cuando **NO sabes cuántas veces** se repetirá el ciclo
* Cuando depende de una condición dinámica

---

## 🛑 BREAK

### 📌 ¿Qué hace?

* Termina el ciclo inmediatamente
* Sale completamente del `while`

```java
while (true) {
    if (x == 3) {
        break;
    }
}
```

### 🔥 Clave mental:

👉 *"Sal del ciclo YA"*

---

## ⏭ CONTINUE

### 📌 ¿Qué hace?

* Salta la iteración actual
* Continúa con la siguiente vuelta del ciclo

```java
if (y % 2 != 0) {
    continue;
}
```

### 🔥 Clave mental:

👉 *"Sáltate esta vuelta, sigue con la siguiente"*

---

## ⚠️ DIFERENCIA IMPORTANTE

| Instrucción | Comportamiento           |
| ----------- | ------------------------ |
| `break`     | Termina TODO el ciclo    |
| `continue`  | Salta SOLO una iteración |

---

## 🔢 CONTADORES EN WHILE

Es importante actualizar variables dentro del ciclo:

```java
z = z + 1;
```

⚠️ Si no lo haces → ciclo infinito

---

## 🎲 NÚMEROS ALEATORIOS

Se usa la clase `Random`:

```java
import java.util.Random;

Random random = new Random();
int numero = random.nextInt(1000);
```

### 📌 Rango:

* `nextInt(1000)` → valores de `0` a `999`

---

## 🔁 WHILE + RANDOM

Ejemplo típico:

```java
while (z < 5) {
    int r = random.nextInt(2000);
    if(r == 1000){
    	break;
    }
}
```

---

## 🧠 CONCEPTOS CLAVE

* Un ciclo necesita:

  * condición
  * control (incremento/decremento)

* `while(true)` → ciclo infinito

* `break` → salida manual

* `continue` → salto parcial

---


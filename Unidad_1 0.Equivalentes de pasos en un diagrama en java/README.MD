# 📘 Fundamentos Básicos de Programación en Java

## ▶️ Estructura de un programa

Inicio del programa:

```java
public static void main(String args[]) {
    // instrucciones
}
```
Fin del programa:

```java
System.exit(0);
```
---

## 📥 Leer valores (entrada de datos)

- Se usa una variable para guardar datos
- Se puede usar Scanner para leer desde teclado

Ejemplo conceptual:

```java
int variable = 10;
```

---

## 🖨️ Imprimir valores

Solo puedes imprimir:
- Variables
- Valores fijos

Ejemplos:

```java
System.out.println(a);
System.out.println("Hola");
System.out.println(10);
```
---

## 💾 Guardar resultados

El resultado de una operación debe guardarse en una variable:

```java
c = a + b;
```
---

## ➕ Operaciones aritméticas

+
-
*
/
%

Ejemplos:

```java
c = a + b;
c = a - b;
c = a * b;
c = a / b;
c = a % b;
```

⚠️ Si no guardas el resultado, se pierde:

```java
System.out.println(a + b); // se imprime pero no se guarda
```

---

## 🔢 Módulo (%)

Devuelve el residuo de una división:

```java
3 / 2 = 1
3 % 2 = 1

4 / 2 = 2
4 % 2 = 0
```
---

## 🔀 Condiciones (IF)

Operadores:

>
<
==
!=
>=
<=

Ejemplo:

```java
if (a > b) {
    // acción
}
```

---

## ⚠️ Reglas importantes

- No puedes usar una variable sin inicializar
- El resultado de operaciones debe guardarse si lo necesitas después
- Solo puedes imprimir variables o valores directos
- Las operaciones se hacen con variables

Ejemplo válido:

```java
c = a * b;
```
Ejemplo inválido (sin contexto de variables):

```java
a * b   ❌
```
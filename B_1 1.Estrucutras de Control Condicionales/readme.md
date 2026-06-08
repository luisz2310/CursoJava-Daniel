# 📘 Java Cheatsheet – Estructuras de Control y Operadores Lógicos

---

## 🧠 CONDICIONALES (IF)

### 📌 ¿Qué hacen?
Permiten tomar decisiones en el programa.

```java
if (condicion) {
    // código que se ejecuta si es TRUE
}
```

### 🔍 Ejemplo

```java
boolean x = 1 > 2; // false
boolean y = 1 < 2; // true
```

✔ Las condiciones SIEMPRE regresan:
- `true`
- `false`

---

## 🔢 OPERADORES DE COMPARACIÓN

| Operador | Significado |
|----------|------------|
| `>`      | Mayor que |
| `<`      | Menor que |
| `>=`     | Mayor o igual |
| `<=`     | Menor o igual |
| `==`     | Igual |
| `!=`     | Diferente |

---

## ⚡ USO DE IF

```java
if (a >= b) {
    System.out.println("Se cumple a >= b");
}

if (a == b) {
    System.out.println("Se cumple a == b");
}
```

⚠️ **IMPORTANTE**
- `if` separados → pueden ejecutarse varios bloques

---

## 🔀 IF - ELSE

```java
if (a > b) {
    System.out.println("Se cumple a > b");
} else {
    System.out.println("No se cumple a > b");
}
```

✔ Solo ejecuta UNA opción

---

## 🔗 IF ANIDADOS

```java
if (a > b) {
    if (a > c) {
        System.out.println("A es mayor que B y C");
    }
}
```

---

## 🔘 Operadores booleanos en Java

- `&&` → AND (y)  
- `||` → OR (o)  
- `!`  → NOT (negación)  

| A | B |  AND |  OR |  XOR |
|---|---|----------|---------|---------|
| T | T | T        | T       | F       |
| T | F | F        | T       | T       |
| F | T | F        | T       | T       |
| F | F | F        | F       | F       |

### 🔍 Ejemplos

```java
// AND
if (a > b && a > c) { }

// OR
if (a > b || a > c) { }

// NOT
if (!(x > 10)) { }
```

---

## ⚠️ PRECEDENCIA LÓGICA

Orden de evaluación:

1. `()`
2. `&&`
3. `||`

```java
// Ejemplo
if (a > b || (c > d && e > f)) { }
```

---

💻 **Nivel:** Principiante  
📚 **Tema:** Lógica y control de flujo en Java

# 📘 Java Cheatsheet – Estructuras de Control y Operadores Lógicos

Clase: Clase1_EstructurasDeControl_Condicionales

---

## 🧠 CONDICIONALES (IF)

### 📌 ¿Qué hacen?
Permiten tomar decisiones en el programa evaluando condiciones booleanas.

```java
if (condicion) {
    // código ejecutado si es TRUE
}
```

✔ Toda condición devuelve: true o false

---

## 🔢 OPERADORES DE COMPARACIÓN

| Operador | Significado |
|----------|------------|
| >        | Mayor que |
| <        | Menor que |
| >=       | Mayor o igual |
| <=       | Menor o igual |
| ==       | Igual |
| !=       | Diferente |

---

## ⚡ IF

```java
if (a >= b) {
    System.out.println("Se cumple a >= b");
}

if (a == b) {
    System.out.println("Se cumple a == b");
}
```

⚠️ if separados pueden ejecutar múltiples bloques

---

## 🔀 IF - ELSE

```java
if (a > b) {
    System.out.println("a > b");
} else {
    System.out.println("No se cumple");
}
```

✔ Solo una opción se ejecuta

---

## 🔁 IF - ELSE IF

```java
if (a > b) {
    System.out.println("a > b");
} else if (a < b) {
    System.out.println("a < b");
} else {
    System.out.println("a == b");
}
```

✔ Solo la primera condición verdadera se ejecuta

---

## 🔗 OPERADORES LÓGICOS

- && → AND
- || → OR
- !  → NOT

```java
if (a > b && a > c) { }

if (a > b || a > c) { }

if (!(a > 10)) { }
```

---

## ⚠️ PRECEDENCIA

1. ()
2. &&
3. ||

---

## 🔀 SWITCH

```java
switch (z) {
    case 1:
        System.out.println("Caso 1");
        break;
    default:
        System.out.println("Default");
}
```

---

## ⚡ SWITCH MODERNO

```java
switch (z) {
    case 1 -> System.out.println("Caso 1");
    default -> System.out.println("Default");
}
```

---

## 🚀 RESUMEN

- if → decisiones
- else → alternativa
- else if → múltiples decisiones
- && → y
- || → o
- switch → múltiples opciones

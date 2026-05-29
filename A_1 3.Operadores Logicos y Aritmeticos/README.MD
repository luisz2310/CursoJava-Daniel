# 📘 Operadores en Java

En esta sección se trabajan dos tipos de operadores fundamentales:
- Operadores aritméticos
- Operadores lógicos

Estos permiten realizar cálculos y tomar decisiones en un programa.

---

## ➕ 1. Operadores Aritméticos

Se usan para realizar operaciones matemáticas.

### Operadores

+  → suma  
-  → resta  
*  → multiplicación  
/  → división  
%  → módulo (residuo de la división)

### Ejemplos

int a = 10;
int b = 5;

int r = a + b;  // 15
r = a - b;      // 5
r = a * b;      // 50
r = a / b;      // 2
r = a % b;      // 0

### 📌 Importante

- Siempre operan con **2 valores**
- Siempre generan un **resultado**
- Si no guardas el resultado, se pierde

Ejemplo:
System.out.println(a + b); // se imprime pero no se guarda

---

## 🔀 2. Operadores Lógicos

Se usan para comparar valores y obtener resultados booleanos.

### Operadores de comparación

>   mayor que  
<   menor que  
==  igual que  
!=  diferente que  
>=  mayor o igual  
<=  menor o igual  

### Ejemplos

int a = 5;
int b = 10;

a > b   → false  
a < b   → true  
a == b  → false  
a != b  → true  

---

## 🔗 Operadores booleanos

Permiten combinar condiciones.

&& → AND (ambas condiciones deben ser true)  
|| → OR (al menos una debe ser true)  
!  → NOT (invierte el valor)

### Ejemplo

int edad = 18;
int nota = 80;

boolean acceso = (edad >= 18) && (nota >= 70);

---

## 🧠 Conceptos clave

- Los operadores aritméticos trabajan con números
- Los operadores lógicos trabajan con valores booleanos
- Puedes combinar múltiples condiciones
- Los resultados pueden usarse para tomar decisiones (if)

---

## 🎯 Objetivo

- Realizar cálculos en Java  
- Comparar valores  
- Crear condiciones lógicas para algoritmos  
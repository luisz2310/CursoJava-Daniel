# 📘 Clase 1 — Variables en Java

Este ejemplo explica cómo declarar variables y mostrar información en consola.

## 🧠 ¿Qué es una variable?
Una variable es un espacio en memoria donde guardamos un valor.

## ✏️ Estructura básica

Declarar una variable:
tipo nombre;

Asignar un valor:
nombre = valor;

Declarar e inicializar:
tipo nombre = valor;

## 🔤 Ejemplos del código

```java
byte m;        // Declaración
m = 2;         // Asignación

byte n1 = 4;   // Declaración + inicialización

char letra = 'a'; // Tipo carácter

int var1 = 10; // tipo integer
```
## 🖨️ Imprimir en consola
```java
// Declaramos una variable
int variable = 2;

// Imprimir el valor de la variable
System.out.println(variable);

// Imprimir texto
System.out.println("Hola mundo");

// Imprimir directamente un número
System.out.println(10);
```
▶️ Salida esperada

2

Hola mundo

10

## 🔗 Concatenación (unir valores)

int edad = 25;
String nombre = "Luis";

// Unir texto + variables
System.out.println("Edad: " + edad);
System.out.println("Nombre: " + nombre);

System.out.println("Hola " + nombre + ", tienes " + edad + " años");

📌 Importante:
- Se usa el operador +
- Si hay texto, todo se convierte a String

▶️ Salida esperada

2
Hola mundo
10
Edad: 25
Nombre: Luis
Hola Luis, tienes 25 años

---

## 🎯 Objetivo de la clase

- Entender qué es una variable  
- Aprender su estructura (declarar, asignar, inicializar)  
- Usar System.out.println  
- Entender la concatenación  
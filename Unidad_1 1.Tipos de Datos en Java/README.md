# 📘 Tipos de Datos en Java

## 🧠 Concepto básico
En programación, los **tipos de datos** definen qué tipo de valor puede almacenar una variable.

### 🔢 Tipos principales
- **Números**
  - Enteros (sin decimales)
  - Decimales
- **Texto**
  - Caracter (`char`)
  - Palabras (`String`)
- **Booleanos**
  - Verdadero o falso (`true` / `false`)

---

## 💾 Bits y representación
Un **bit** es la unidad mínima de computación y solo puede tener dos valores:

0 o 1

### 🔢 Combinaciones según número de bits

1 bit  -> 0, 1                  -> 2 valores  
2 bits -> 00, 01, 10, 11        -> 4 valores (0–3)  
3 bits -> 000 ... 111           -> 8 valores (0–7)  
4 bits -> 0000 ... 1111         -> 16 valores (0–15)  
8 bits -> 00000000 ... 11111111 -> 256 valores (0–255)  

📌 Regla general:  
Cantidad de valores = 2^n   (n = número de bits)

---

## ☕ Tipos de datos en Java

### 🔢 Números enteros
| Tipo  | Tamaño | Descripción |
|------|--------|------------|
| `byte`  | 8 bits  | Enteros pequeños |
| `short` | 16 bits | Enteros medianos |
| `int`   | 32 bits | Enteros comunes | Usar cuando no se el tamano
| `long`  | 64 bits | Enteros grandes |

### 🔢 Números decimales
| Tipo   | Tamaño | Descripción |
|--------|--------|------------|
| `float`  | 32 bits | Menor precisión | Usar cuando no se el tamano
| `double` | 64 bits | Mayor precisión |

### 🔤 Texto
| Tipo    | Tamaño | Descripción |
|---------|--------|------------|
| `char`  | 16 bits | Un solo carácter |
| `String`| Variable | Cadena de texto | 

Ejemplo:
char letra = 'W';

Representación numérica:
'W' = 119

### ✅ Booleanos
| Tipo     | Valores |
|----------|--------|
| `boolean` | `true` o `false` |

También se puede representar como:
true  -> 1  
false -> 0  

---

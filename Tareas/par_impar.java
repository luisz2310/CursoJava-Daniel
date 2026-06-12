```java
public class par_impar {
	public static void main(String arg[]) {

		int numero = 211;

		int resultado = numero % 2; 

		// System.out.println(resultado);	

		// 💡 BUENA PRÁCTICA:
		// Cuando una operación (>, <, ==, %, etc.) solo se utiliza
		// para evaluar una condición en un if, NO es necesario
		// guardarla en una variable intermedia.
		//
		// Puedes usar la expresión directamente dentro del if,
		// lo que hace el código más limpio y fácil de leer.
		//
		// ❌:
		// int resultado = numero % 2; 
		// if (resultado == 0)
		//
		// ✅ Mejor:
		// if (numero % 2 == 0)

		if (numero % 2 == 0) {
			System.out.println("El numero '" + numero + "' es par");
		} else {
			System.out.println("El numero '" + numero + "' es impar");
		}
	}
}
```

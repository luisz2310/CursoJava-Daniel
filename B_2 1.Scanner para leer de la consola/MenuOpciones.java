import java.util.Scanner;

public class Parte2_MenuOpciones {

	public static void main(String arg[]) {
		
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Multiplicar");
		System.out.println("4.Dividir");
		System.out.println("5.Salir");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa la opcion:");
		int n = sc.nextInt();
		
		if(n == 1) {
			System.out.println("Ingresa el primer valor a sumar:");
			int a = sc.nextInt();
			System.out.println("Ingresa el segundo valor a sumar:");
			int b = sc.nextInt();
			int r = a+b;
			System.out.println("El resultado de la suma es: " + r);
			
		}
		if( n == 2) {
			
		}
		
		System.exit(0);
	}
	
}

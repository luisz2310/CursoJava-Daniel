
public class par_impar {
	public static void main(String arg[]) {

		int numero = 211;

		int resultado = numero % 2; 

		//System.out.println(resultado);	

		//SUGERENCIA QUI
		//CUANDO usa el resulado de >, <, ==, % solo para un if no necesitas guardarlo en una variable
		//solo usalo directamente 
	  //if (resultado == 0) {
		if( numero%2 == 0) {
			System.out.println("El numero '" + numero + "' Es par");
		} else {
			System.out.println("El numero '" + numero + "' Es impar");
		}
		
		
	}
}
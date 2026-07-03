import java.util.Random;

public class randnum {

	public static void main(String[] args) {
	Random random = new Random();

		
	int z= 0;
	
	while(true) { //while (z<=6) { // LOS WHILE DE PREFERENCIA SE USAN CUANDO NO NECEISOT UN CONTADOR 
		int r = random.nextInt(10);
		System.out.println ("r:" + r);
		System.out.println ("z: " + z);

		if (r == 6) {
			break;
		}
		z =z+1; 
	}
	
	
	boolean flag = true;
	
	while(flag) {  
		int r = random.nextInt(10);
		System.out.println ("r:" + r);
		System.out.println ("z: " + z);

		if (r == 6) {
			flag = false;
		}
		z =z+1; 
		}
	}
}



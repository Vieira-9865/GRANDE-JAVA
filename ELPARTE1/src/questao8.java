
import java.util.Scanner;

public class questao8 {

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int contPares = 0;
     for (int i = 1; i < 16; i++) {
		System.out.println("Digite o n�mero " + i + ":" );
		int numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			contPares++;
		}
		
	}
     System.out.println("A quantidade de n�meros pares s�o esses: " + contPares + " n�meros");
	}

}

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o n�mero: ");
		int numero = scan.nextInt();
		if (numero % 2 == 0) {
			System.out.println(numero+ " � um n�mero par!" );
		} else {
			System.out.println(numero+ " � um n�mero impar!" );

		}
		
		
				

	}

}

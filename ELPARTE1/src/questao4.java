import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 	
			String rica, ale;
			double salrica, salale = 0;
			
			System.out.println("Digite o nome do primeiro programador");
			rica = scan.next();
			System.out.println("Digite o nome do segundo programador");
			ale = scan.next();
			System.out.println("Digite o sal�rio de " + rica);
			salrica = scan.nextDouble();
			System.out.println("Digite o sal�rio de " + ale);
			salale = scan.nextDouble();
			
			if (salrica > salale) {
				System.out.println("O sal�rio de " + rica + " � o maior do que o de " + ale);
				
			}  if (salale > salrica) {
				System.out.println("O sal�rio de " + ale + " � o maior do que o de " + rica);
			} if (salrica == salale)  {
				System.out.println("O sal�rio dos dois s�o iguais!");
			}
		
	}
}


import java.util.Scanner;

public class maiordeidade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome = scan.nextLine();
		int idade = scan.nextInt();
		System.out.print("Digite sua idade");
		
		if (idade >= 18 ) {
			System.out.println(nome + "� maior de idade");
		} else {
			System.out.println("Aten��o!" + nome + "� menor de idade");
		}
	}

}

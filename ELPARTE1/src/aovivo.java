import java.util.Scanner;

public class aovivo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nomefuncrico = "";
		String nome = "";
		double media, soma = 0;
		int cont = 0;
		double maiorSalario = 0;
		double salario = 0;
		do {
			scan = new Scanner(System.in);			
			System.out.println("Digite o nome do funcion�rio");
		    nome = scan.nextLine();
		
		   if (nome.equalsIgnoreCase("fim")) {
			   break;
		}
		
			System.out.println("Digite o sal�rio do funcion�rio");
		    salario = scan.nextDouble();
		    
		    cont++;
		    soma += salario;
		    
		    if (maiorSalario < salario ) {
				maiorSalario = salario;
				nomefuncrico = nome;
			}
			
			
		} while (!nome.equalsIgnoreCase("fim")); 
		media = soma / cont;
		System.out.println("A m�dia de salarios �:" + media );
		System.out.println("O funcion�rio que ganha mais �: " + nomefuncrico);
	}

}

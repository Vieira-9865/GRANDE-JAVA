import java.util.Scanner;

public class questao9 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("****Seja bem vindo ao nosso sistema de chatbot *****");
    System.out.println("****MENU*****");
    System.out.println("0-SAIR");
    System.out.println("1-CADASTRAR ATIVIDADE");
    System.out.println("2-ATUALIZAR ATIVIDADE");
    System.out.println("3-REMOVER ATIVIDADE");
    
    try {
    	
		System.out.println("Digite sua op��o desejada:");
        int op�ao = scan.nextInt();
        
        
       while (op�ao != 0) {
    	   switch (op�ao) {
   		
   		case 1:
   			System.out.println("Voc� escolheu cadastrar uma nova atividade!!");
   			break;
   		case 2:
   			System.out.println("Voc� escolheu atualizar uma atividade!!");
   			break;
   		case 3:
   			System.out.println("Voc� escolheu remover uma atividade!!");
   			break;
   		default:
   			System.out.println("Aten��o! Voc� escolheu uma op��o inv�lida! Tente novamente.");
   			break;
   		}
    	   System.out.println("Digite outra op��o desejada");
    	   op�ao = scan.nextInt();
	}
    
			System.out.println("Obrigado por utilizar nosso sistema. At� mais.");
			System.exit(0);
    	
	} catch (Exception e) {
		System.out.println("Aten��o! Ocorreu um erro inesperado no sistema. favor contactar o Administrador do sistema.");
	}
	}

}

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int irmao1, irmao2, irmao3, irmao4;
		int somaidademaior15 = 0;
		System.out.println("Digite a idade do primeiro irm�o");
		irmao1 = scan.nextInt();
		System.out.println("Digite a idade do segundo irm�o");
		irmao2 = scan.nextInt();
		System.out.println("Digite a idade do terceiro irm�o");
		irmao3 = scan.nextInt();
		System.out.println("Digite a idade do quarto irm�o");
		irmao4 = scan.nextInt();
		
		if (irmao1 > 15 ) {
			somaidademaior15 = somaidademaior15 + irmao1;
		} 
         if (irmao2 > 15) {
        	somaidademaior15 = somaidademaior15 + irmao2;
		} 
         if (irmao3 > 15) {
        	 somaidademaior15 += irmao3;
		} 
         if (irmao4 > 15) {
             somaidademaior15 += irmao4;	
			}
		   
		System.out.println("A soma das idades de quem tem mais de 15 anos �:" + somaidademaior15); 
 }

}

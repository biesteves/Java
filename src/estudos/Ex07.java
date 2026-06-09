package estudos;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a primeira nota: ");
	        double nota1 = scanner.nextDouble();

	        System.out.print("Digite a segunda nota: ");
	        double nota2 = scanner.nextDouble();

	        System.out.print("Digite a terceira nota: ");
	        double nota3 = scanner.nextDouble();

	        double media = (nota1 + nota2 + nota3) / 3;

	        System.out.println("Média: " + media);

	        if (media >= 7 && media <= 10) {
	            System.out.println("Aluno APROVADO!");
	        } else if (media >= 4 && media < 7) {
	            System.out.println("Aluno em PROVA FINAL!");
	        } else {
	            System.out.println("Aluno REPROVADO!");
	        }

	        scanner.close();

	}

}

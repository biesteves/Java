package estudos;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Olá, me informe o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Prazer em conechecer " + nome +"! me informe qual a sua idade?: ");
		int idade = scanner.nextInt();
		
		System.out.println("Certo! Quantos meses além dos anos você tem?: ");
		int mes = scanner.nextInt();
		
		System.out.println("Quantos dias além dos meses?: ");
		int dia = scanner.nextInt();
		int total;
		
		total = (idade * 365) + (mes * 30) + dia;
		
		
		System.out.println("Você tem: " + total);
		
	}

}

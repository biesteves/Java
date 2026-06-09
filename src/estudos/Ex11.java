package estudos;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("1 - Bilhete Unitário");
	        System.out.println("2 - Bilhete Duplo");
	        System.out.println("3 - Bilhete de 10 viagens");
	        System.out.print("Escolha o tipo de bilhete: ");
	        int tipo = scanner.nextInt();

	        System.out.print("Digite o valor pago: R$ ");
	        double valorPago = scanner.nextDouble();

	        double preco = 0;

	        switch (tipo) {
	            case 1:
	                preco = 2.00;
	                break;
	            case 2:
	                preco = 3.00;
	                break;
	            case 3:
	                preco = 12.00;
	                break;
	            default:
	                System.out.println("Tipo de bilhete inválido!");
	                scanner.close();
	                return;
	        }

	        int quantidade = (int) (valorPago / preco);
	        double troco = valorPago - (quantidade * preco);

	        System.out.println("Quantidade de bilhetes: " + quantidade);
	        System.out.println("Troco: R$ " + troco);

	        scanner.close();

	}

}

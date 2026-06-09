package estudos;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o saldo médio: R$ ");
	        double saldoMedio = scanner.nextDouble();

	        double credito;

	        if (saldoMedio <= 200) {
	            credito = 0;
	        } else if (saldoMedio <= 400) {
	            credito = saldoMedio * 0.20;
	        } else if (saldoMedio <= 600) {
	            credito = saldoMedio * 0.30;
	        } else {
	            credito = saldoMedio * 0.40;
	        }

	        System.out.println("Saldo médio: R$ " + saldoMedio);
	        System.out.println("Valor do crédito: R$ " + credito);

	        scanner.close();

	}

}

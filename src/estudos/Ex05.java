package estudos;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		        Scanner entrada = new Scanner(System.in);

		        System.out.print("Digite a quantidade de fitas: ");
		        int fitas = entrada.nextInt();

		        System.out.print("Digite o valor do aluguel: ");
		        double valorAluguel = entrada.nextDouble();

		        // 1/3 das fitas são alugadas por mês
		        double alugadasMes = fitas / 3.0;

		        // Faturamento mensal e anual
		        double faturamentoMensal = alugadasMes * valorAluguel;
		        double faturamentoAnual = faturamentoMensal * 12;

		        // 1/10 das fitas alugadas são devolvidas com atraso
		        double atrasadas = alugadasMes / 10.0;

		        // Multa de 10% sobre o valor do aluguel
		        double multaPorFita = valorAluguel * 0.10;
		        double valorMultasMes = atrasadas * multaPorFita;

		        // 2% das fitas estragam ao longo do ano
		        double fitasEstragadas = fitas * 0.02;

		        // Compra de reposição equivalente a 1/10 do total de fitas
		        double fitasCompradas = fitas / 10.0;

		        // Quantidade final de fitas
		        double fitasFinal = fitas - fitasEstragadas + fitasCompradas;

		        System.out.println("\n--- RESULTADOS ---");
		        System.out.println("Faturamento anual: R$ " + faturamentoAnual);
		        System.out.println("Valor ganho com multas por mês: R$ " + valorMultasMes);
		        System.out.println("Quantidade de fitas no final do ano: " + fitasFinal);

		        entrada.close();
		    }
		}

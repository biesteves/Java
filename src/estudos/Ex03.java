package estudos;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in); //entrada.de.dados
		double celsius, fahrenheit;
		
		System.out.print("Digite a temperatura em Celsius: ");
		celsius = scanner.nextDouble();
		
		fahrenheit = ((9 * celsius) + 160) /5; //multiplica.por.9..soma.por.160..divide.por.5.
		System.out.println("A Temperatura em fahrenheit é: " + fahrenheit);
		
		scanner.close();
	}

}

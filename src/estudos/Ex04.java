package estudos;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Olá, me informe o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print(nome + ", informe a hora atual: ");
        int hora = scanner.nextInt();

        System.out.print("Informe os minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Informe os segundos: ");
        int segundos = scanner.nextInt();

        int totalSegundos = (hora * 3600) + (minutos * 60) + segundos;

        System.out.println("Já se passaram " + totalSegundos + " segundos do dia.");
    }
}
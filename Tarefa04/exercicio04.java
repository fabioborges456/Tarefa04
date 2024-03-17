package tarefa04deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class ConversaoRealPorDolar04 {

	/*
	 * 4) Elaborar um programa que efetue a apresentação do valor da conversão em
	 * real de um valor lido em dólar. O programa deve solicitar o valor da cotação
	 * do dólar e também a quantidade de dólares disponível com o usuário, para que
	 * seja apresentado o valor em moeda brasileira.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Valor que você tem em Dolares: ");
		float valorDolar = sc.nextFloat();
		float conversaoReal = valorDolar * 5;

		System.out.println("O valor que você tem, convertido em reais é: R$ " + conversaoReal);

		sc.close();
	}
}

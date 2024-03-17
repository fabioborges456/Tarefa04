package tarefa04deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class CalcularValorDeUmCaixaRetangular02 {

	/*
	 * 2) Elaborar um programa que calcule e apresente o volume de uma caixa
	 * retangular, por meio da fórmula VOLUME=COMPRIMENTO * LARGURA * ALTURA.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite valor do Comprimento: ");
		float comprimento = sc.nextFloat();
		System.out.println("Digite o valor da Largura: ");
		float largura = sc.nextFloat();
		System.out.println("Digite Valor da Altura: ");
		float altura = sc.nextFloat();

		float volume = comprimento * largura * altura;
		System.out.println("O volume da Caixa é : " + volume);

		sc.close();
	}
}

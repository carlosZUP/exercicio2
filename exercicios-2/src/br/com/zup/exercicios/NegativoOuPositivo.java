package br.com.zup.exercicios;

import java.util.Scanner;

public class NegativoOuPositivo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um Número: ");
		int numero = entrada.nextInt();
		
		if(numero >= 0) {
				System.out.println("O número " + numero + "é positivo...");
		} else {
			System.out.println("O número " + numero + " é negativo...");
		}
		
	}

}

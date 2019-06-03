package br.com.zup.exercicios;

import java.util.Scanner;

public class TransferirNumeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero3;
		
		System.out.println("Digite um numero: ");
		int numero1 = entrada.nextInt();
		
		System.out.println("Digite outro numero: ");
		int numero2 = entrada.nextInt();
		
		numero3 = numero1;
		numero1 = numero2;
		numero2 = numero3;
		
		System.out.println("O valor do numero1 é " + numero1);
		System.out.println("O valor do numero2 é " + numero2);
	
	}

}

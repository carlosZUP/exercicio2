package br.com.zup.exercicios;

import java.util.Scanner;

public class MenorMaior {
	public static void main(String[] args) {
	//3) Escreva um programa que leia dois números e apresente a diferença do maior para o menor.
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero1;
		numero1 = entrada.nextInt();
		
		System.out.println("Digite um número: ");
		int numero2;
		numero2 = entrada.nextInt();
		
		if(numero1 < numero2) {
			System.out.println("O numero " + numero1 + " é menor que o numero " + numero2);
		} else {
			System.out.println("O numero " + numero1 + " é maior que o numero " + numero2);
		}
	}
}

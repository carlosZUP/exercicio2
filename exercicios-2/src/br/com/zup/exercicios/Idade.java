package br.com.zup.exercicios;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
	//2) Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
	//	meses e dias e escreva a idade dessa pessoa expressa apenas em dias. 
		//Considerar ano com 365 dias e mês com 30 dias.
	Scanner entrada = new Scanner(System.in);
	System.out.println("qual é a sua idade:");
	double idade = entrada.nextInt();
	
	double dias = idade * 365;
	System.out.println("Sua idade em dias é de: " + dias);
	
	double meses = idade * 12;
	System.out.println("Sua idade em meses é de: " + meses);
	
	double anos = idade * 1;
	System.out.println("Você tem  " + anos + " anos" );
	
	double nasceu = (idade - 2019) * - 1;
	System.out.println("Você nasceu no ano de " + nasceu);
	
	
	
	
	
	
	}
}

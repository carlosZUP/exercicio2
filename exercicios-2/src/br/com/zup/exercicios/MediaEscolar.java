package br.com.zup.exercicios;

import java.util.Scanner;

public class MediaEscolar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual foi a sua primeira nota?");
		int nota1 = entrada.nextInt();
		
		System.out.println("Qual foi a sua segunda nota?");
		int nota2 = entrada.nextInt();
		
		System.out.println("Qual foi a sua terceira nota?");
		int nota3 = entrada.nextInt();
		
		System.out.println("Qual foi a sua quarta nota?");
		int nota4 = entrada.nextInt();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media <= 7) {
			System.out.println("ou Não, você repetiu de ano. Sua média foi " + media );
		} else {
			System.out.println("Parabéns, você passou de ano. Sua média foi " + media);
		}
		
	}

}

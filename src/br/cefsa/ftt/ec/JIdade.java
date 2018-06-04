package br.cefsa.ftt.ec;

import java.util.Scanner;

public class JIdade {
	
	//IO: Linha de comando...

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("JIdade...");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe seu ano de nascimento: ");
		
 	    System.out.println("Sua idade é: " + (2018 - scanner.nextInt()));
 	    
 	    scanner.close();

	}

}

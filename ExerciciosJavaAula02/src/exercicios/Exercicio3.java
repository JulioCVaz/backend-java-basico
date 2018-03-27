package exercicios;
import java.util.Scanner;

public class Exercicio3 {
	
/*	Escreva um programa que exiba na tela a tabuada de
	um número que deverá ser informado pelo usuário 
	(deverá ser usada qualquer estrutura de repetição).  */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tabuada;
		
		System.out.println("Digite o número de uma tabuada: ");
		tabuada = scan.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			int operacao = tabuada * i;
			System.out.println(tabuada + " x " + i + " = " + operacao);
		}
		

	}

}

package exercicios;
import java.util.Scanner;

public class Exercicio3 {
	
/*	Escreva um programa que exiba na tela a tabuada de
	um n�mero que dever� ser informado pelo usu�rio 
	(dever� ser usada qualquer estrutura de repeti��o).  */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tabuada;
		
		System.out.println("Digite o n�mero de uma tabuada: ");
		tabuada = scan.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			int operacao = tabuada * i;
			System.out.println(tabuada + " x " + i + " = " + operacao);
		}
		

	}

}

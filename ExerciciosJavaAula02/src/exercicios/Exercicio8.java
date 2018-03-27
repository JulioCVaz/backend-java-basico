package exercicios;
import java.util.Scanner;

public class Exercicio8 {
	/*
	Escreva um programa que calcule o fatorial de um número informado pelo usuário. 
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int calculo = 1;
		
		System.out.println("Digite um número: ");
		numero = scan.nextInt();
		
		int numeroInicial = numero;
	
		for(int i=1; i<=numero; i++) {
			calculo = calculo*numero;
			numero--;
			i--;
			
		}
		
		System.out.println("Fatorial de " +numeroInicial+"!" + " é :" + calculo);
		
		
	}

}

package exercicios;
import java.util.Scanner;

public class Exercicio5 {
	/*
	Escreva um programa que leia 
	15 números inteiros e exiba na tela ao 
	final, o maior número que foi digitado pelo usuário. 
	*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		int[] array = new int[15];
		int valorMaximo = 0;
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("Digite o " + i +" número :");
			array[i] = scan.nextInt();
			System.out.println("Armazenado número " + array[i]);
			
			
			if(array[i] > valorMaximo) {
				valorMaximo = array[i]; 
			}	
		}
		
		for(int i = 0; i<array.length; i++) {
			System.out.println("Valor digitador na posicao: " + i + " " + array[i]);
		}
		

		
		System.out.println("Maior valor digitado: " + valorMaximo );
		
		

	}

}

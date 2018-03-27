package exercicios;
import java.util.Scanner;

public class Exercicio5 {
	/*
	Escreva um programa que leia 
	15 n�meros inteiros e exiba na tela ao 
	final, o maior n�mero que foi digitado pelo usu�rio. 
	*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		int[] array = new int[15];
		int valorMaximo = 0;
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("Digite o " + i +" n�mero :");
			array[i] = scan.nextInt();
			System.out.println("Armazenado n�mero " + array[i]);
			
			
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

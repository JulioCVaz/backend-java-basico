package exercicio2;

import java.lang.Math;

public class TesteArea {

	public static void main(String[] args) {
		// intancias
		Quadrado quad = new Quadrado(8);
		Circulo circ = new Circulo(10);
		Retangulo retang = new Retangulo(5, 10);
		
		// retornos
		System.out.println("Área do quadrado: " + Math.round(quad.calcularArea()));
		System.out.println("Área do Circulo: " + Math.round(circ.calcularArea()));
		System.out.println("Área do Retangulo: "+ Math.round(retang.calcularArea()));
	}

}

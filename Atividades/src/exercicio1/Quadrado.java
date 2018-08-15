package exercicio1;

public class Quadrado implements FormaGeometrica{
	
	private double lado1;
	private double lado2;
	
	
	public double getLado1() {
		return lado1;
	}
	
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	
	public double getLado2() {
		return lado2;
	}
	
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	@Override
	public double getArea() {
		double area = 0;
		area = lado1 * lado2;
		return area;
	}
	@Override
	public double getComprimento() {
		double comprimento;
		
		if(lado1 > lado2) {
			comprimento = lado1;
		}else {
			comprimento = lado2;
		}
		
		return comprimento;
	}
}

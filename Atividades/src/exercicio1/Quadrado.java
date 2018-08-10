package exercicio1;

public class Quadrado implements FormaGeometrica{
	
	private double lado;
	
	
	public double getLado() {
		return lado;
	}
	
	public void setLado() {
		this.lado = lado;
	}
	
	@Override
	public double getArea() {
		double area = 0;
		area = lado * 4;
		return lado;
	}
	@Override
	public double getComprimento() {
		double comprimento;
		// TODO comprimento print
	}
}

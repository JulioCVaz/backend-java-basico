package exercicio1;

public class Circulo implements FormaGeometrica{
	private double raio;
	private double pi;
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getPi() {
		return pi;
	}
	
	public void setPi() {
		this.pi = pi;
	}
	
	@Override
	public double getArea() {
		double area = 0;
		area = 2 * pi * raio;
		return area;
	}
	@Override
	public double getComprimento() {
		double comprimento = 0;
		comprimento = raio * 2;
		return comprimento;
	}
	
}

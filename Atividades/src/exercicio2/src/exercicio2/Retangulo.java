package exercicio2;

public class Retangulo {
	
	private double base;
	private double altura;
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Retangulo(double base, double altura) {
		setBase(base);
		setAltura(altura);
	}
	
	public double calcularArea() {
		
		double area;
		
		area = this.base * this.altura;
		
		return area;
		
	}
	
	
}

package exercicio2;

public class Circulo implements AreaCalculavel{
	private double diametro;

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	public Circulo(double diametro) {
		setDiametro(diametro);
	}
	
	public double calcularArea() {
		
		double area;
		double pi = 3.14;
		double raio = this.diametro / 2;
		
		area = 2 * pi * raio;
		
		return area;
	}

}

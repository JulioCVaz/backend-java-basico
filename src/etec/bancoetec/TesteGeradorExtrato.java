package etec.bancoetec;

public class TesteGeradorExtrato{
	
	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente();
		ContaPoupanca c2 = new ContaPoupanca();
		
		c1.deposita(200);
		c2.deposita(300);
		
		GeradorDeEstrato g = new GeradorDeEstrato();
		
		g.geraExtrato(c1);
		g.geraExtrato(c2);
	}

}

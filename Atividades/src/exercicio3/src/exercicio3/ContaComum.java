package exercicio3;

public class ContaComum implements ContaCorrente{
	
	private double condicao = 0.5;
	private double saldo = 0;
	private double deposito;
	private double saque;

	public double getCondicao() {
		return condicao;
	}

	public void setCondicao(double condicao) {
		this.condicao = condicao;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}

	public double saldo() {
		
		return this.saldo;
		
	}
	
	public double depositar(double money) {
		
		this.saldo = money;
		
		return this.saldo;
	}
	
	public double sacar(double money) {
		
		double valor;
		double valortotal;
		
		valor = money * condicao;
		
		valortotal = this.saldo - (money + valor);
		
		this.saldo = valortotal;
		
		return valortotal;
	}

}

package etec.bancoetec;

public class ContaCorrente implements Conta{
	
		private double saldo;
		private double taxaPorOperacao = 0.45;
		
		
		// Resposta Exercicio Exemplo 1 - Ao alterar o nome de um metodo definido na interface o mesmo apresente erro na compilação
		public void deposita(double valor) {
			this.saldo += valor - this.taxaPorOperacao;
		}
		
		public void saca(double valor) {
			this.saldo -= valor - this.taxaPorOperacao;
			
		}
		
		public double getSaldo() {
			return this.saldo;
		}

}

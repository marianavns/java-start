
class Conta {
	
	// ATRIBUTOS DO OBJETO (instância) QUE SERÁ CRIADO.
	private double saldo;
	private int numeroConta;
	private int agencia;
	private Cliente titular;
	
	// ATRIBUTOS DA CLASSE EM SI
	private static int totalContasCriadas;
	 
	
	// CONSTRUTORES PERSONALIZADOS
	// (Permite que a única forma de criar um objeto seja preenchendo alguns campos.)
	public Conta(int numeroConta, int agencia, Cliente titular) {
		if (numeroConta <= 0 || agencia <= 0) {
			throw new IllegalArgumentException("Insira números positivos para agência e conta.");
		}
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		Conta.totalContasCriadas++;
	}
	// Mais um construtor para o mesmo objeto. A diferença é o parâmetro.
	public Conta(int saldo) {
		this.saldo = saldo;	
		Conta.totalContasCriadas++;
	}
	// É proibido ter dois construtores com o mesmo número e mesmos tipos de parâmetro.

	
	// MÉTODOS PARA USAR NO OBJETO CRIADO (INSTÂNCIA)
	public Double getSaldo() {
		return this.saldo;
	}
	
	public boolean deposita(double valor) {	
		if (valor > 0) {
			this.saldo += valor;
			return true;
		}
		return false;
	}
	
	public void saca(double valor) {	
		if (valor <= 0) {
			System.out.println("Insira um valor positivo para saque.");
			return;
		}
		if (this.saldo <= valor) {
			System.out.println("Não há saldo sufuciente para esta operação de saque.");
			return;
		} 
		this.saldo -= valor;
		System.out.println(
			"Saque de R$" + valor + " efetuado com sucesso! " +
				"Seu novo saldo é R$" + this.saldo);	
	}	
	
	public void transfere(double valorTransferencia, Conta contaDestino) {
		if (valorTransferencia <= 0) {
			System.out.println("Insira um valor positivo para transferência.");
			return;
		}
		if (this.saldo < valorTransferencia) {
			System.out.println( 
				"Não há saldo suficiente para transferir R$" + valorTransferencia +
				", pois o saldo atual é R$" + this.saldo
			);
			return;
		}
		double saldoAnterior = this.saldo;
		this.saldo -= valorTransferencia;
		contaDestino.saldo += valorTransferencia;
		System.out.println(
			"Transferência efetuada com sucesso. Saldo anterior: R$" + saldoAnterior +
			". Saldo atual: R$" + this.saldo + "."
		);
	}

	public Integer getNumero() {
		return this.numeroConta;
	}
	
	public Cliente getCliente() {
		return this.titular;
	}
	
	// MÉTODOS PARA USAR NA CLASSE EM SI
	public static int getTotalContasCriadas() {
		return totalContasCriadas;
	}
	
}

/* 
Crie duas contas, para Ana e Bruno.
	Ana deve ter 700 reais na conta e:
		a) Tentar transferir -50 reais para Bruno;
		b) Tentar transferir 1000 reais para Bruno;
		c) Tentar transferir 100 reais para Bruno;
		d) Tentar sacar valor negativo;
		e) Tentar sacar 1000 reais;
	Bruno deve ter 100 reais na conta e:
		a) Depositar 250 reais;
		b) Tentar sacar 2000 reais;
		c) Tentar sacar 50 reais.
*/

public class testaTransacoes {
	
	public static void main(String[] args) {
		
		/* Exemplo de construtor padrão:
			Conta contaMaria = new Conta();
				NÃO conseguimos impor obrigatoriedade de campos com ele */
		
		// Atributos da instância definidos na hora da criação:
		Cliente ana = new Cliente("Ana", "076.666.888-44");
		Cliente bruno = new Cliente("Bruno", "675.666.888-00");
		Cliente carlos = new Cliente("Ana", "222.666.333-11");
		Conta contaAna = new Conta(1337, 9567, ana);
		Conta contaBruno = new Conta(2335, 89007, bruno);
		Conta contaCarlos = new Conta(988, 1332, carlos);
		
		// Atributos da instância definidos depois da criação:
		// ana.setNome("zelia"); --> Esse não funciona, pois o "setNome" foi deletado.
		ana.setIdade(19);
		
		contaAna.deposita(700);
		contaAna.transfere(-50.0, contaBruno);
		contaAna.transfere(1000.0, contaBruno);
		contaAna.transfere(100.0, contaBruno);
		contaAna.saca(-1000.0);
		contaAna.saca(1000.0);
		
		contaBruno.deposita(100.0);
		contaBruno.saca(1000.0);
		contaBruno.saca(50);
		
		Conta contaDilma = new Conta(200);
		System.out.println("Total de contas criadas --> " + Conta.getTotalContasCriadas());	
	}

}

public class ContaBanco {

	private double saldo;
	private int agencia;
	private ContaBanco Nome;
	private int numero;
	private String Titular;
	
	public ContaBanco getNome() {
		return Nome;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setsaldo(String Saldo) {
		this.saldo = saldo;
	}
	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean Transfere(double valor, ContaBanco destino ) {
		if (this.saldo >= valor)  {		
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public ContaBanco getTitular() {
		// TODO Auto-generated method stub
		return null;
	}


	public void setNome(String string) {
		// TODO Auto-generated method stub
		
	}
}

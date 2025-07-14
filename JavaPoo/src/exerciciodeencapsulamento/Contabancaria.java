package exerciciodeencapsulamento;

public class Contabancaria {
	private String numeroConta;
	private double Saldo;
	
public String getNumeroConta() {
	return numeroConta;
	}
	public void setnumeroConta(String numeroConta){
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double Saldo) {
		this.Saldo = Saldo;
	}
public void saqueConta(double valor) {
	if (Saldo > 0 && Saldo >=valor) {
		this.Saldo-=valor;
	}else {
		System.out.println("Não há valor na sua conta.");
		
	}
	
    }
public void depositoConta(double valor) {
	if ( valor > 0) {
	}else {
		System.out.println("Deposite um valor válido.");
		
	}
}
}

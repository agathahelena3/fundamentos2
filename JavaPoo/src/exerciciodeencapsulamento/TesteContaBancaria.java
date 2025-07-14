package exerciciodeencapsulamento;

public class TesteContaBancaria {
	public static void main (String[] args) {
		Contabancaria minhaConta=new Contabancaria();
		minhaConta.setnumeroConta("123456");
		minhaConta.depositoConta(20000);
		minhaConta.saqueConta(1000);
		System.out.println(minhaConta.getSaldo());
	}

}

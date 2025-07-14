package acabou;

class Corredor extends Atleta{
	public Corredor(String nome, int idade) {
		super(nome, idade);
		
	}
	public void Correr() {
			System.out.println(nome + "Está correndo.");
		}
	public void PararCorrer () {
		System.out.println(nome + "Parou de correr.");
	}
}

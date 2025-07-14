package acabou;

class Ciclista extends Atleta{
	public Ciclista(String nome, int idade) {
		super(nome, idade);

	}
	public void Pedalar() {
			System.out.println(nome + "Está pedalando.");
		}
	public void PararPedalar () {
		System.out.println(nome + "Parou de pedalar.");
	}
}
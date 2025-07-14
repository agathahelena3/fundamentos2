package acabou;

class Nadador extends Atleta{
	public Nadador(String nome, int idade) {
		super(nome, idade);
		
	}
	public void Nadar() {
			System.out.println(nome + "Está nadando.");
		}
	public void PararNadar () {
		System.out.println(nome + "Parou de nadar.");
	}
}
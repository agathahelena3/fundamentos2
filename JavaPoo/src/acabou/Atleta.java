package acabou;

abstract public class Atleta {
	String nome;
	int idade;

public Atleta (String nome, int idade) {
	this.nome=nome;
	this.idade=idade;
}
public void Aquecer() {
	System.out.println(nome + "Está aquecendo");

}
}
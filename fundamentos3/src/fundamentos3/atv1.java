package fundamentos3;

public class atv1 {
	public static void main (String[] args) {
		String str = new String();
		String texto = "hello mundo";
		str = texto.replace("h,"
				+ "hello", "Olá");
		System.out.println(str);
		
		//trocar string
		
		String nome = "agatha";
		String nomeM = "AGATHA";
		String nome2 = nome.toUpperCase();
		System.out.println(nome2);
		char c = nome.charAt(0);
		System.out.println(c);
		//mostrar a letra apenas
		
		boolean b1 = nome.equals("agatha");
		boolean b2 = nome.equals(nome2);
		boolean b3 = nome.equalsIgnoreCase(nome2);
		boolean b4 = nome.equalsIgnoreCase("azul");
		System.out.println(b3);
		//comparar se é igual
}}

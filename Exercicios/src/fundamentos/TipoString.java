package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ol� pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.contentEquals("boa tarde"));
		
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + 
				"\nSobrenome: " + sobrenome + 
				"\nIdade: " + idade + 
				"\nSalario: " + salario + "\n\n");
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f",
				nome, sobrenome, idade, salario);
		
		 
	}
}
